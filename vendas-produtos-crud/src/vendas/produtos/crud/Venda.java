package vendas.produtos.crud;

import java.util.List;
import java.util.Scanner;

public class Venda {
    int id;
    private int numeroDaVenda;
    private Funcionario funcionarioVenda;
    private Cliente clienteVenda;
    private List<Produto> produtos;

    public void menu() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("0 - Sair");
        System.out.println("1 - Realizar venda");
        System.out.println("2 - Ver carrinho");
        System.out.println("3 - Finalizar venda");
        System.out.println("4 - Cadastrar produto");
        System.out.println("5 - Cadastrar funcionario");
        System.out.println("6 - Cadastrar cliente");

        System.out.print("Opcao: ");
        entrada.nextInt();

        int opcao = Integer.parseInt(entrada.toString());

        if (opcao == 0) {
            System.out.println("Você saiu!");
        } else if (opcao == 1) {
            realizarVenda();
        } else if (opcao == 2) {
            verCarrinho();
        } else if (opcao == 3) {
            finalizarVenda();
        } else if (opcao == 4) {
            cadastrarProduto();
        } else if (opcao == 5) 
            cadastrarFuncionario();
        } else if (opcao == 6) {
            cadastrarCliente();
    }

    public void realizarVenda() {
    }

    public void verCarrinho() {
        System.out.println("****************CARRINHO****************");
        System.out.println("******************FIM******************");
    }

    public void finalizarVenda() {
        System.out.println("**************************VENDA********************");
        System.out.println("*****************VENDA FINALIZADA*****************");
    }
    
    public void cadastrarProduto(int id, String nome, int quantidade,  numeroDaVenda) {
        Estoque estoque = new Estoque();
        estoque.cadastrarProduto(id, nome, quantidade, numeroDaVenda);
    }
}
