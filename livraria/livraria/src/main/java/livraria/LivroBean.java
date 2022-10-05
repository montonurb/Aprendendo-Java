package livraria;

import dao.DAO;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import modelo.Livro;
import javax.faces.context.FacesContext;
import modelo.Autor;

@ManagedBean
public class LivroBean {

    private Livro livro = new Livro();
    private Integer autorId;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    public List<Livro> getLivros() {
        return new DAO<>(Livro.class).pegarLivros();
    }

    public List<Autor> getAutores() {
        return new DAO<>(Autor.class).pegarAutores();
    }

    public List<Autor> getAutoresDoLivro() {
        return this.livro.getAutores();
    }

    public void gravarAutor() {
        System.out.println("Gravando livro.");
        Autor autor = new DAO<>(Autor.class).buscaPorId(this.autorId);
        this.livro.adicionarAutor(autor);
        System.out.println("Livro gravado.");
}

    public void salvar() {
        if (livro.getAutores().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage("autor", new FacesMessage("Livro deve ter pelo menos um autor."));
        }

        new DAO<>(Livro.class).adiciona(this.livro);
        this.livro = new Livro();
    }
    
    public void remover(Livro livro) {
        System.out.println("Removendo livro...");
        new DAO<>(Livro.class).remove(livro);
        System.out.println("Removou!");
    }
    
    public String irParaCadastrarAutor() {
        return "cadastrarAutor?faces-redirect=true";
    }
}
