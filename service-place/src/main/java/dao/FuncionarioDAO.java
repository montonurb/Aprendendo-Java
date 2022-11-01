package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Funcionario;

/**
 *
 * @author montonurb
 */
public class FuncionarioDAO {

    public boolean login(Funcionario funcionario) {
        EntityManager manager = new JPAUtil().getEntityManager();
        TypedQuery<Funcionario> query = manager.createQuery("select f from Funcionario f where f.email = :pEmail and f.senha = :pSenha", Funcionario.class);

        query.setParameter("pEmail", funcionario.getEmail());
        query.setParameter("pSenha", funcionario.getSenha());
        Funcionario funcionarioLogado = query.getSingleResult();

        manager.close();
        return funcionarioLogado != null;
    }
}
