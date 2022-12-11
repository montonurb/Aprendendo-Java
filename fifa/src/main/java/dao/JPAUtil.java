package dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("fifa");
    
    public EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
