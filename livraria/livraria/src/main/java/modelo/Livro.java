package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Livro {
    
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String titulo;
    private String isbn;
    private double preco;
    @Temporal(TemporalType.DATE)
    private Calendar dataLancamento = Calendar.getInstance();
    
    @ManyToMany
    private List<Autor> autores = new ArrayList<Autor>();

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

    public Calendar getDataLancamento() {
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

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }
}
