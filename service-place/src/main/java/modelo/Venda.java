package modelo;

import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Venda {
    
    @Id
    @GeneratedValue
    private Integer id;
    private Cliente cliente;
    private List<Produto> carrinho;
    private GregorianCalendar dataVenda;
    private Funcionario funcionario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(List<Produto> carrinho) {
        this.carrinho = carrinho;
    }

    public GregorianCalendar getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(GregorianCalendar dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String visualizarVendas() {
        return "visualizarVendas?faces-redirect=true";
    }
}
