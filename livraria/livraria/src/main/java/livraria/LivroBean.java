package livraria;

import dao.DAO;
import modelo.Livro;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class LivroBean {

    private Livro livro = new Livro();

    public Livro getLivro() {
        return livro;
    }

    //METODOS
    public void salvar() {
        System.out.println("Gravando livro: " + this.livro.getTitulo() + ", " + this.livro.getIsbn() + ", " + this.livro.getPreco() + ", " + this.livro.getDataLancamento() + ".");
        
        System.out.println("TESTE");
        
        /*if(livro.getAutores().isEmpty()) {
            throw new RuntimeException("Livro deve ter ao menos um autor.");
        }*/
        
        //new DAO(Livro.class).adiciona(this.livro);
    }
}
