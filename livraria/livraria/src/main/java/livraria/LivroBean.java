package livraria;

import dao.DAO;
import java.util.List;
import modelo.Livro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Autor;

@ManagedBean
@ViewScoped
public class LivroBean {

    private Livro livro = new Livro();
    private Integer autorId;

    public Integer getAutorId() {
        return autorId;
    }

    public void setAutorId(Integer autorId) {
        this.autorId = autorId;
    }

    public Livro getLivro() {
        return livro;
    }

    public List<Autor> getAutores() {
        return new DAO(Autor.class).listaTodos();
    }

    public List<Autor> getAutoresDoLivro() {
        return this.livro.getAutores();
    }

    public void gravarAutor() {
        Autor autor = new DAO<>(Autor.class).buscaPorId(this.autorId);
        this.livro.adicionarAutor(autor);
    }

    public void salvar() {
        System.out.println("Gravando livro: " + this.livro.getTitulo());

        if (livro.getAutores().isEmpty()) {
            throw new RuntimeException("Livro deve ter ao menos um autor.");
        }

        new DAO(Livro.class).adiciona(this.livro);
        this.livro = new Livro();
    }
}
