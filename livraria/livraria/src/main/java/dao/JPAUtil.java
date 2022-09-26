package dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class JPAUtil {
    
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("foxmanagerPU");
    
    public EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
