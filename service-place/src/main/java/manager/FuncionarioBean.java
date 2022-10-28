package manager;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelo.Funcionario;

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
        new DAO<>(Funcionario.class).adicionar(this.funcionario);
        this.funcionario = new Funcionario();
        return "visualizarFuncionarios?faces-redirect=true";
    }

    public List<Funcionario> buscarTodos() {
        return new DAO<>(Funcionario.class).buscarTodosFuncionarios();
    }

    public void editarFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
        System.out.println("Editando");
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
