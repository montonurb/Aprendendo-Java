package service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author montonurb
 */
public class JPAUtil {
    private static final EntityManagerFactory MANAGER = Persistence.createEntityManagerFactory("fox-fifa");
    
    public EntityManager getEntityManager() {
        return MANAGER.createEntityManager();
    }
}
