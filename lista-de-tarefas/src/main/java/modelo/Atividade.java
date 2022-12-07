package modelo;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author montonurb
 */
@Entity
public class Atividade {
    @Id
    private Long id;
    @Column(length = 200, nullable = true)
    private String nome;
    private String descricao;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtividade;

    public Atividade(Long id, String nome, Date dataAtividade) {
        this.id = id;
        this.nome = nome;
        this.dataAtividade = dataAtividade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(Date dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.dataAtividade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atividade other = (Atividade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dataAtividade, other.dataAtividade)) {
            return false;
        }
        return true;
    }
    
    
}
