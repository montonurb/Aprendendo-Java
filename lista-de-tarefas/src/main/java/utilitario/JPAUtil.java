package utilitario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author montonurb
 */
public class JPAUtil {
    EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("ListaDeTarefasPU");
    
    public EntityManager getEntityManager() {
        return entityManager.createEntityManager();
    }
}
