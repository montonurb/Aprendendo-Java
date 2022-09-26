package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
    
    @Id @GeneratedValue
    private Integer id;

    private String titulo;
    private String isbn;
    private double preco;
    private String dataLancamento;
    
    @ManyToMany
    private List<Autor> autores = new ArrayList<Autor>();

    //GETTERS AND SETTERS

    public List<Autor> getAutores() {
        return autores;
    }

    public Integer getId() {
        return id;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPreco() {
        return preco;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }
}
