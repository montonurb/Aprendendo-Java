package vendas.produtos.crud;

import java.util.Map;

public class Produto {

    private String nome;
    private int quantidade;
    private double valorParaVenda;

    Produto(String nome, int quantidade, double valorParaVenda) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorParaVenda = valorParaVenda;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorParaVenda() {
        return valorParaVenda;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorParaVenda(double valorParaVenda) {
        this.valorParaVenda = valorParaVenda;
    }

    @Override
    public String toString() {
        return  "Nome: " + this.nome + " | Quantidade: " + this.quantidade + " | Valor: " + this.valorParaVenda;
    }

    
}
