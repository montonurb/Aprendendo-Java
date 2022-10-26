package manager;

import javax.faces.bean.ManagedBean;
import modelo.Cliente;

@ManagedBean
public class ClienteBean {

    private Cliente cliente;

    public void ClienteBean() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String visualizarClientes() {
        return "visualizarClientes?faces-redirect=true";
    }
}
