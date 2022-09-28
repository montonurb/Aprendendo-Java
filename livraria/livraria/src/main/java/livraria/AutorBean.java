package livraria;

import dao.DAO;
import javax.faces.bean.ManagedBean;
import modelo.Autor;

@ManagedBean
public class AutorBean {

    private Autor autor = new Autor();

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void salvar() {
        new DAO<>(Autor.class).adiciona(this.autor);
        this.autor = new Autor();
    }
}
