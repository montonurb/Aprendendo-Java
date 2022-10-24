package manager;

import dao.FuncionarioDAO;
import javax.faces.context.FacesContext;
import modelo.Funcionario;

/**
 *
 * @author montonurb
 */
public class LoginBean {

    Funcionario funcionario = new Funcionario();

    public String fazerLogin() {
        boolean logado = new FuncionarioDAO().login(this.funcionario);

        if (logado) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().getSessionMap().put("funcionarioLogado", this.funcionario);
            return "home?faces-redirect=true";
        } else {
            return "login?faces-redirect=false";
        }
    }
}
