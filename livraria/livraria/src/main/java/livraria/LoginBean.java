package livraria;

import dao.DAO;
import dao.UsuarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import modelo.Usuario;

@ManagedBean
public class LoginBean {

    private Usuario usuario = new Usuario();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String fazerLogin() {
        System.out.println("BUSCANDO " + this.usuario.getEmail() + "...");
        boolean logado = new UsuarioDAO().login(this.usuario);
        System.out.println(">>>" + logado);
        if (logado) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().getSessionMap().put("usuarioLogado", this.usuario);
            return "inicio?faces-redirect=true";
        } else {
            return "login?faces-redirect=false";
        }
    }
    
    public String irParaLogin() {
        return "login?faces-redirect=true";
    }
}
