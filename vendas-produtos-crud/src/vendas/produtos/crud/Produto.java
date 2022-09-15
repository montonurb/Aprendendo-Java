package vendas.produtos.crud;

import java.util.Map;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double valorParaVenda;

    Produto(String nome, int quantidade, double valorParaVenda) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorParaVenda = valorParaVenda;
    }

}
