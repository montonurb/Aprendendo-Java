package model;

import enums.Sexo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Future;

/**
 *
 * @author montonurb
 */

@Entity
public class Jogador implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private int numero;
    private int tamanhoCamisa;
    private double peso;
    @Future
    private Date dataCadastro;
    private int tamanhoSapato;
    @Future
    private Date dataNascimento;
    private Sexo sexo;

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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTamanhoCamisa() {
        return tamanhoCamisa;
    }

    public void setTamanhoCamisa(int tamanhoCamisa) {
        this.tamanhoCamisa = tamanhoCamisa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int getTamanhoSapato() {
        return tamanhoSapato;
    }

    public void setTamanhoSapato(int tamanhoSapato) {
        this.tamanhoSapato = tamanhoSapato;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
