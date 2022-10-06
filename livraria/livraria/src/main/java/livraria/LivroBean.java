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
        Autor autor = new DAO<>(Autor.class).buscaPorId(this.autorId);
        this.livro.adicionarAutor(autor);
    }

    public void salvar() {
        /*
        if (livro.getAutores().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage("autor", new FacesMessage("Livro deve ter pelo menos um autor."));
        }*/
        
        System.out.println("ID SALVAR: " + this.livro.getId());

        if (this.livro.getId() == null) {
            System.out.println("Novo livro!");
            new DAO<>(Livro.class).adiciona(this.livro);
        } else {
            System.out.println("Editar livro!");
            new DAO<>(Livro.class).atualiza(this.livro);
        }
        
        this.livro = new Livro();
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
