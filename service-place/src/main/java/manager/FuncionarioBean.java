package manager;

import dao.DAO;
import javax.faces.bean.ManagedBean;
import modelo.Funcionario;

@ManagedBean
public class FuncionarioBean {

    private Funcionario funcionario = new Funcionario();

    public void FuncionarioBean() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrarFuncionario() {
        System.out.println("Salvando " + this.funcionario.getNome());
        new DAO<>(Funcionario.class).adicionar(this.funcionario);
        System.out.println("Salvo!");
        this.funcionario = new Funcionario();
    }

    public String visualizarFuncionarios() {
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public String irParaCadastrarFuncionario() {
        return "cadastrarFuncionario?faces-redirect=true";
    }

}
