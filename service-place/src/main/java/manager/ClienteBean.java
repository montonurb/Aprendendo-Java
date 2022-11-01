package manager;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelo.Cliente;

@ManagedBean
public class ClienteBean {

    private Cliente cliente = new Cliente();
    private Integer id;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void ClienteBean() {
    }
    
    public String salvar() {
        new DAO<>(Cliente.class).adicionar(this.cliente);
        this.cliente = new Cliente();
        return "visualizarClientes?faces-redirect=true";
    }
    
    public List<Cliente> buscarTodos() {
        return new DAO<>(Cliente.class).buscarTodosClientes();
    }

    public String visualizarClientes() {
        return "visualizarClientes?faces-redirect=true";
    }
}
