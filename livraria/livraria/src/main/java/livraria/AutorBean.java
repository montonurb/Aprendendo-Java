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
    
    public void salvar() {
        System.out.println("Autor: " + this.autor.getNome());
        new DAO(Autor.class).adiciona(this.autor);
    }
}
