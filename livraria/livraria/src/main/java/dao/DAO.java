package dao;

import javax.persistence.EntityManager;

public class DAO<T> {
    private final Class<T> classe;
    
    public DAO(Class<T> classe) {
        this.classe = classe;
    }
    
    public void adiciona(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        
        manager.getTransaction().begin();
        
        manager.persist(t);
        
        manager.getTransaction().commit();
        
        manager.close();
    }
    
    public void remove(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        
        manager.getTransaction().begin();
        
        manager.remove(manager.merge(t));
        
        manager.getTransaction().commit();
        
        manager.close();
    }
    
    public void atualiza(T t) {
        EntityManager manager = new JPAUtil().getEntityManager();
        
        manager.getTransaction().begin();
        
        manager.remove(manager.merge(t));
        
        manager.getTransaction().commit();
        
        manager.close();
    }
}
