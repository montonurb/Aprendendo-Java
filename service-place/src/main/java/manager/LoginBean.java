package manager;

import dao.FuncionarioDAO;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import modelo.Funcionario;


@ManagedBean
public class LoginBean {

    private Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String fazerLogin() {
        boolean logado = new FuncionarioDAO().login(this.funcionario);

        if (logado) {
            System.out.println("TESTE");
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().getSessionMap().put("funcionarioLogado", this.funcionario);
            return "index?faces-redirect=true";
        } else {
            return "login?faces-redirect=false";
        }
    }
    
    public String fazerLogout() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().getSessionMap().remove("funcionarioLogado");
        return "login?faces-redirect=true";
    }
}
