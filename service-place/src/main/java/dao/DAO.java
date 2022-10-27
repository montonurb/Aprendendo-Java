package dao;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Funcionario;
import modelo.Produto;

public class DAO<T> {

    private final Class<T> classe;

    public DAO(Class<T> classe) {
        this.classe = classe;
    }

    public void adicionar(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();

        manager.persist(t);

        manager.getTransaction().commit();

        manager.close();
    }

    public void remover(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.remove(manager.merge(t));
        manager.getTransaction().commit();
        manager.close();
    }

    public void atualizar(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.remove(manager.merge(t));
        manager.getTransaction().commit();
        manager.close();
    }
    
    public List<Funcionario> buscarTodosFuncionarios() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select f from Funcionario f";
        List<Funcionario> funcionarios = manager.createQuery(sql, Funcionario.class).getResultList();
        manager.close();
        return funcionarios;
    }

    public List<Produto> buscarTodosProdutos() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select p from Produto p";
        List<Produto> produtos = manager.createQuery(sql, Produto.class).getResultList();
        manager.close();
        return produtos;
    }
}
