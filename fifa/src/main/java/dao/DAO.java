package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Jogador;
import modelo.Time;

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
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        TypedQuery<Jogador> sql = manager.createQuery("delete from Jogador j where j.id = :pId", Jogador.class);
        sql.setParameter("pId", id);
        sql.getResultList();
    }

    public List<Jogador> buscarTodosJogadores() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select j from Jogador j";
        List<Jogador> jogador = manager.createQuery(sql, Jogador.class).getResultList();
        manager.close();
        return jogador;
    }
    
    public List<Time> buscarTodosTimes() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select t from Time t";
        List<Time> times = manager.createQuery(sql, Time.class).getResultList();
        manager.close();
        return times;
    }

    public Jogador buscarJogadorPorId(Integer id) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        TypedQuery<Jogador> sql = manager.createQuery("select j from Jogador j where j.id = :pId", Jogador.class);

        sql.setParameter("pId", id);
        Jogador jogador = sql.getSingleResult();

        return jogador;
    }

}
