package vendas.produtos.crud;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    Map<Integer, Produto> produtos = new HashMap<>();

    public void cadastrarProduto(int codigoProduto, String nome, int quantidade, double valorVenda) {
        this.produtos.put(codigoProduto, new Produto(nome, quantidade, valorVenda));
        System.out.println("\n***********************");
        System.out.println("* Produto cadastrado! *");
        System.out.println("***********************\n");
        System.out.println(produtos);
    }
    
    public void visualizarEstoque() {
        for(Map.Entry produto : produtos.entrySet()){
            System.out.println(produto);
        }
        
    }
}
