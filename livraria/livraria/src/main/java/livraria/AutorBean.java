package livraria;

import dao.DAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Autor;

@ManagedBean
@ViewScoped
public class AutorBean {

    private Autor autor = new Autor();

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void salvar() {
        System.out.println("Autor: " + this.autor.getNome());

        new DAO(Autor.class).adiciona(this.autor);

        this.autor = new Autor();
    }
}
