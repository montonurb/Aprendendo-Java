package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Usuario;

public class UsuarioDAO {

    public boolean login(Usuario usuario) {
        EntityManager manager = new JPAUtil().getEntityManager();
        
        TypedQuery<Usuario> query = manager.createQuery("select u from Usuario u where u.email = :pEmail and u.senha = :pSenha", Usuario.class);

        query.setParameter("pEmail", usuario.getEmail());
        query.setParameter("pSenha", usuario.getSenha());
        Usuario usuarioLogado = query.getSingleResult();
        manager.close();

        return usuarioLogado != null;
    }
}
