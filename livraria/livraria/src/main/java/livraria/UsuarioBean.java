package livraria;

import dao.DAO;
import javax.faces.bean.ManagedBean;
import modelo.Usuario;

@ManagedBean
public class UsuarioBean {
    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void salvar() {
        System.out.println("Salvando!");
        new DAO<>(Usuario.class).adiciona(usuario);
        System.out.println("Salvo: " + this.usuario.getNome() + "!!!");
        this.usuario = new Usuario();
    }
}
