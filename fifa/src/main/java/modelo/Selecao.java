package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author montonurb
 */
@Entity
public class Selecao implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private int capacidade;
    @OneToMany
    private List<Jogador> jogadores = new ArrayList<Jogador>();
    private Date dataCadastro;

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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void adicionarJogador(Jogador jogador) {
        if (!this.jogadores.contains(jogador)) {
            this.jogadores.add(jogador);
        }
    }

    public void removerJogador(Jogador jogador) {
        this.jogadores.remove(jogador);
        System.out.println("REMOVIDO!");
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
