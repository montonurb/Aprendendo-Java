package vendas.produtos.crud;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    Map<Integer, Produto> produtos = new HashMap<>();
    
    public void produtosAutomatizados() {
        produtos.put(1, new Produto("Ribbon", 10, 49.99));
        produtos.put(2, new Produto("Papel Timbrado", 10, 129.99));
        produtos.put(3, new Produto("Rema de papel", 5, 29.99));
    }

    public void cadastrarProduto(int codigoProduto, String nome, int quantidade, double valorVenda) {
        this.produtos.put(codigoProduto, new Produto(nome, quantidade, valorVenda));
        System.out.println("\n***********************");
        System.out.println("* Produto cadastrado! *");
        System.out.println("***********************\n");
        System.out.println(produtos);
    }
    
    public void visualizarEstoque() {
        System.out.println("************************ESTOQUE************************");
        for(Map.Entry produto : produtos.entrySet()){
            System.out.println(produto);
        }
        System.out.println("*******************************************************");
        
    }
}
