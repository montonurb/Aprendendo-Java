package livraria;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelo.Autor;

@ManagedBean
public class AutorBean {

    private Autor autor = new Autor();
    private Integer autorId;
    
    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }
    
    public void carregarAutorId() {
        this.autor = new DAO<>(Autor.class).buscaPorId(autorId);
    }
    
    public String salvar() {
        this.autor.getNome();
        new DAO<>(Autor.class).adiciona(this.autor);
        this.autor = new Autor();
        
        return "inicio?faces-redirect-true";
    }
    
    public List<Autor> getAutores() {
        return new DAO(Autor.class).pegarAutores();
    }
    
    public void editar(Autor autor) {
        this.autor = autor;
        remover(autor);
    }
    
    public void remover(Autor autor) {
        new DAO<>(Autor.class).remove(autor);
    }
    
    public String irParaCadastrarLivro() {
        return "cadastrarLivro?faces-redirect=true";
    }
}
