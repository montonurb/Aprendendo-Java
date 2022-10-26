package manager;

import javax.faces.bean.ManagedBean;
import modelo.Venda;

@ManagedBean
public class VendaBean {
    private Venda venda;

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
    public String visualizarVendas() {
        return "visualizarVendas?faces-redirect=true";
    }
    
}
