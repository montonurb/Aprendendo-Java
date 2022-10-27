package manager;

import dao.DAO;
import java.util.List;
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

    public void salvar() {
        System.out.println("Salvando " + this.funcionario.getNome());
        new DAO<>(Funcionario.class).adicionar(this.funcionario);
        System.out.println("Salvo!");
        this.funcionario = new Funcionario();
    }

    public List<Funcionario> buscarTodos() {
        System.out.println("Buscando todos...");
        return new DAO<>(Funcionario.class).buscarTodosFuncionarios();
    }

    public String visualizarFuncionarios() {
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public String cadastrarFuncionario() {
        return "cadastrarFuncionario?faces-redirect=true";
    }

}
