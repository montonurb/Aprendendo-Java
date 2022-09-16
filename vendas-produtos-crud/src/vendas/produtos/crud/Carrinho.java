package vendas.produtos.crud;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {

    ArrayList<Produto> produtosCarrinho = new ArrayList<>();

    public void adicionarProdutoCarrinho(Estoque estoque) {
        Scanner entradaCodigo = new Scanner(System.in);
        int codigo;
        Produto produtoEscolhido;

        do {
            System.out.print("Informe o codigo do produto: ");
            codigo = Integer.parseInt(entradaCodigo.nextLine());

            if (estoque.produtos.containsKey(codigo)) {
                produtoEscolhido = estoque.produtos.get(codigo);
                produtosCarrinho.add(produtoEscolhido);
            } else {
                System.out.println("opcao invalida! Informe um codigo do produto que esteja cadastrado.");
                estoque.visualizarEstoque();
            }
        } while (!estoque.produtos.containsKey(codigo));

        System.out.println("\n***********************");
        System.out.println("* Produto adicionado! *");
        System.out.println("***********************\n");
        
        System.out.println("Deseja adicionar outro produto?");
        System.out.println("1 - SIM");
        System.out.println("2 - NAO");
        System.out.print("Opcao: ");
        //CAPTURAR DADO
    }
}
