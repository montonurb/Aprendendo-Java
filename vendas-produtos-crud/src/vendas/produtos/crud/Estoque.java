package vendas.produtos.crud;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    Map<Integer, Produto> produtos = new HashMap<>();
    
    public void cadastrarProduto(int codigo, String nome, int quantidade, double valorVenda) {
        this.produtos.put(codigo, new Produto(nome, quantidade, valorVenda));
    }
}
