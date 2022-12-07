package service;

import java.util.List;
import javax.persistence.EntityManager;
import model.Time;

/**
 *
 * @author montonurb
 */
public class DAO<G> {
    private final Class<G> classe;

    public DAO(Class<G> classe) {
        this.classe = classe;
    }
    
    //SALVAR NOVO DADO NO BANCO
    public void cadastrar(G genericClass) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(genericClass);
        manager.getTransaction().commit();
        manager.close();
    }
    
    public List<Time> buscarTimes() {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        String sql = "select t from Time t";
        List<Time> times = manager.createQuery(sql, Time.class).getResultList();
        manager.close();
        return times;
    }
    
    public void atualizar(G genericClass ) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.merge(genericClass);
        manager.getTransaction().commit();
        manager.close();
    }
    
    //DELETAR DADO NO BANCO
    public void remover(G genericClass) {
        EntityManager manager = new JPAUtil().getEntityManager();
        manager.getTransaction().begin();
        manager.remove(manager.merge(genericClass));
        manager.getTransaction().commit();
        
    }
    
}
