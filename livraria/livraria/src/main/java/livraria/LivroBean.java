package livraria;

import dao.DAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import modelo.Livro;
import modelo.Autor;

@ManagedBean
public class LivroBean {

    private Livro livro = new Livro();
    private Integer autorId;
    private Integer livroId;

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

    public Integer getLivroId() {
        return livroId;
    }

    public void setLivroId(Integer livroId) {
        this.livroId = livroId;
    }
    
    public void carregarLivroId() {
        this.livro = new DAO<>(Livro.class).buscaPorId(livroId);
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
        Autor autor = new DAO<>(Autor.class).buscaPorId(this.autorId);
        this.livro.adicionarAutor(autor);
    }

    public String salvar() {
        new DAO<>(Livro.class).adiciona(this.livro);
        this.livro = new Livro();
        
        return "inicio?faces-redirect=true";
    }

    public void editar(Livro livro) {
        this.livro = livro;
        remover(livro);
    }

    public void remover(Livro livro) {
        new DAO<>(Livro.class).remove(livro);
    }

    public String irParaCadastrarAutor() {
        return "cadastrarAutor?faces-redirect=true";
    }
}
