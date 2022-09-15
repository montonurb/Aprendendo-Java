package vendas.produtos.crud;

import java.util.Map;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private double valorVenda;
    
    Produto(String nome, int quantidade, double valorVenda) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorVenda = valorVenda;
    }
    
}
