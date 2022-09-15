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

    @Override
    public String toString() {
        return  "Nome: " + this.nome + " | Quantidade: " + this.quantidade + " | Valor: " + this.valorParaVenda;
    }

    
}
