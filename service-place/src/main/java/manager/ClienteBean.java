package manager;

import dao.DAO;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelo.Cliente;

@ManagedBean
@ViewScoped
public class ClienteBean {

    private Cliente cliente;
    private String id;

    @PostConstruct
    public void iniciar() {
        Map<String, String> paramentros = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        this.id = paramentros.get("clienteId");

        if (this.id == null) {
            instanciar();
        } else {
            delegar(this.id);
        }
    }

    public void instanciar() {
        this.cliente = new Cliente();
    }

    public void delegar(String id) {
        this.cliente = buscarClientePorId(id);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void ClienteBean() {
    }

    public String salvar() {
        if (this.cliente.getId() != null) {
            System.out.println("Atualizando!");
            new DAO<>(Cliente.class).atualizar(this.cliente);
        } else {
            System.out.println("Cadastrando!");
            new DAO<>(Cliente.class).adicionar(this.cliente);
        }
        this.cliente = new Cliente();
        return "visualizarClientes?faces-redirect=true";
    }

    public String editar(Cliente cliente) {
        this.cliente = cliente;
        return "cadastrarCliente?faces-redirect=true";
    }
    
    public void excluir(Cliente cliente) {
        new DAO<>(Cliente.class).remover(cliente);
    }

    public List<Cliente> buscarTodos() {
        return new DAO<>(Cliente.class).buscarTodosClientes();
    }

    public Cliente buscarClientePorId(String id) {
        return new DAO<>(Cliente.class).buscarClientePorId(id);
    }

    public String visualizarClientes() {
        return "visualizarClientes?faces-redirect=true";
    }
}
