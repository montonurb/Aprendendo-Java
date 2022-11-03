package manager;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Funcionario;
import org.primefaces.PrimeFaces;

@ManagedBean
@ViewScoped
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

    public String salvar() {
        new DAO<>(Funcionario.class).adicionar(this.funcionario);
        this.funcionario = new Funcionario();
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public List<Funcionario> buscarTodos() {
        return new DAO<>(Funcionario.class).buscarTodosFuncionarios();
    }

    public void exibirDialogParaEditar(Funcionario funcionario) {
        this.funcionario = funcionario;
        PrimeFaces.current().executeScript("PF('funcionarioDialog').show()");
    }

    public String editarFuncionario() {
        if (this.funcionario.getId() != null) {
            excluir(this.funcionario);
            salvar();
        } else {
            salvar();
        }
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public void excluir(Funcionario funcionario) {
        new DAO<>(Funcionario.class).remover(funcionario);
    }

    public String visualizarFuncionarios() {
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public String cadastrarFuncionario() {
        return "cadastrarFuncionario?faces-redirect=true";
    }

}
