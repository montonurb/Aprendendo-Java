package manager;

import javax.faces.bean.ManagedBean;
import modelo.Produto;

@ManagedBean
public class ProdutoBean {

    private Produto produto;

    public void ProdutoBean() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public String visualizarProdutos() {
        return "visualizarProdutos?faces-redirect=true";
    }
    
    public String irParaCadastrarProdutos() {
        return "cadastrarProduto?faces-redirect=true";
    }
}
