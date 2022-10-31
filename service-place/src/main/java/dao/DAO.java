package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
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
    
    public void atualizar(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(t);
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
    
    public void removerPorId(Integer id) {
        System.out.println("Excuindo id: " + id);
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        TypedQuery<Funcionario> sql = manager.createQuery("delete from Funcionario f where f.id = :pId", Funcionario.class);
        sql.setParameter("pId", id);
        sql.getResultList();
    }
    
    public List<Funcionario> buscarTodosFuncionarios() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select f from Funcionario f";
        List<Funcionario> funcionarios = manager.createQuery(sql, Funcionario.class).getResultList();
        manager.close();
        return funcionarios;
    }
    
    public Funcionario buscarFuncionarioPorId(Integer id) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        TypedQuery<Funcionario> sql = manager.createQuery("select f from Funcionario f where f.id = :pId", Funcionario.class);

        sql.setParameter("pId", id);
        Funcionario funcionario = sql.getSingleResult();
        
        return funcionario;
        
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
