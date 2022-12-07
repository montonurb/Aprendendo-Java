package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author montonurb
 */
public class Time {
    private Long id;
    private String nome;
    private int capacidade;
    private List<Object> jogadores;
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

    public List<Object> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Object> jogadores) {
        this.jogadores = jogadores;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
    
}
