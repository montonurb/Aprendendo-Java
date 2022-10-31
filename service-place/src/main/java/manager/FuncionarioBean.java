package manager;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelo.Funcionario;
import org.primefaces.PrimeFaces;

@ManagedBean
public class FuncionarioBean {

    private Funcionario funcionario = new Funcionario();
    private Integer id;

    public void FuncionarioBean() {
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String salvar() {
        System.out.println("FUNC: " + this.funcionario.getNome());
        new DAO<>(Funcionario.class).adicionar(this.funcionario);
        this.funcionario = new Funcionario();
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public List<Funcionario> buscarTodos() {
        return new DAO<>(Funcionario.class).buscarTodosFuncionarios();
    }

    public void exibirDialogParaEditar(Funcionario funcionario) {
        this.id = funcionario.getId();
        this.funcionario = funcionario;
        PrimeFaces.current().executeScript("PF('funcionarioDialog').show()");
        excluir(this.funcionario);
    }

    public String editarFuncionario() {
        salvar();
        return "visualizarFuncionarios?faces-redirect=true";

    }

    public void excluir(Funcionario funcionario) {
        new DAO<>(Funcionario.class).remover(funcionario);
    }

    public void excluirPorId(Integer id) {
        new DAO<>(Funcionario.class).removerPorId(id);
    }

    public String visualizarFuncionarios() {
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public String cadastrarFuncionario() {
        return "cadastrarFuncionario?faces-redirect=true";
    }

}
