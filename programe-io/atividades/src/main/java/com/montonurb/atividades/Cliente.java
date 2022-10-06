package com.montonurb.atividades;

import java.time.LocalDate;
import java.time.Period;
/*
    1. Crie uma classe para representar um cliente,
    com os atributos nome, cpf, telefone, sexo, ano
    de nascimento. Crie os métodos para:
        * imprimir todos dados do cliente.
        * calcular a idade do cliente
        * verificar se ele é maior ou menor de idade
 */
public class Cliente {

    String nome;
    String cpf;
    String telefone;
    String sexo;
    String anoDeNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(String anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String imprimirDados(Cliente cliente) {
        return cliente.nome + ", de CPF " + cliente.cpf + ", telefone: " + cliente.telefone + ", Sexo: " + cliente.sexo.toUpperCase() + ", nascido em " + cliente.anoDeNascimento + ".";
    }

    public Integer calculaIdade(String dataNascimento) {
        try {
            LocalDate nascimento = LocalDate.parse(dataNascimento);
            LocalDate dataAtual = LocalDate.now();
            int idade = Period.between(nascimento, dataAtual).getYears();
            if (idade < 0) {
                return -1;
            } else {
                return idade;
            }
        } catch (Exception e) {
            System.out.println("Data inválida! (Formato correto: yyyy-MM-dd)" + e.toString());
            return -1;
        }
    }

    public String verificarMaioridade(String dataNascimento) {
        Integer idade = calculaIdade(dataNascimento);
        if (idade >= 18) {
            return "É maior de idade!";
        } else if (idade >= 0 && idade < 18) {
            return "É menor de idade!";
        } else {
            return "Data informada é inválida!";
        }
    }
}
