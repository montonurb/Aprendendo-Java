package manager;

import dao.DAO;
import java.util.List;
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
    
    public List<Produto> buscarProdutos() {
        return new DAO<>(Produto.class).buscarTodosProdutos();
    }
    
    public String visualizarProdutos() {
        return "visualizarProdutos?faces-redirect=true";
    }
    
    public String irParaCadastrarProdutos() {
        return "cadastrarProduto?faces-redirect=true";
    }
}
