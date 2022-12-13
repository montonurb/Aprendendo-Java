package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Jogador;
import modelo.Selecao;

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
    
    public List<T> buscarTodos() {
        EntityManager manager = new JPAUtil().getEntityManager();
        CriteriaQuery<T> query = manager.getCriteriaBuilder().createQuery(classe);
        query.select(query.from(classe));
        
        List<T> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
    
    public T buscaPorId(Long id) {
        EntityManager manager = new JPAUtil().getEntityManager();
        T t = manager.find(classe, id);
        manager.close();
        return t;
    }

    public Jogador buscarJogadorPorId(Long id) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        TypedQuery<Jogador> sql = manager.createQuery("select j from Jogador j where j.id = :pId", Jogador.class);

        sql.setParameter("pId", id);
        Jogador jogador = sql.getSingleResult();

        return jogador;
    }

}
