package dao;

import java.util.List;
import javax.persistence.EntityManager;
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

    public List<Produto> buscarTodosProdutos(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "SELECT p from Produto p";
        List<Produto> produtos = manager.createQuery(sql, Produto.class).getResultList();
        manager.close();
        return produtos;
    }
}
