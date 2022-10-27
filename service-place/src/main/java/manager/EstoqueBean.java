package manager;

import javax.faces.bean.ManagedBean;
import modelo.Estoque;

@ManagedBean
public class EstoqueBean {

    private Estoque estoque;

    public void EstoqueBean() {
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }
    
    public String visualizarEstoque() {
        return "visualizarEstoque?faces-redirect=true";
    }

}
