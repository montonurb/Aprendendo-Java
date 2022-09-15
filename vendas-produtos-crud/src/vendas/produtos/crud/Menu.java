package vendas.produtos.crud;

import java.util.Scanner;

public class Menu {
    
    Estoque estoque = new Estoque();

    public void menuInicial() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("0 - Sair");
        System.out.println("1 - Ver estoque");
        System.out.println("2 - Realizar venda");
        System.out.println("3 - Ver carrinho");
        System.out.println("4 - Finalizar venda");
        System.out.println("5 - Cadastrar produto");
        System.out.println("6 - Cadastrar funcionario");
        System.out.println("7 - Cadastrar cliente");

        System.out.print("Opcao: ");

        try {
            opcao = Integer.parseInt(entrada.next());
            escolhaDoUsuario(opcao);
        } catch (Exception e) {
            System.out.println(e + " nao e um numero inteiro.");
        }
    }

    public void escolhaDoUsuario(int opcao) {

        switch (opcao) {
            case 0:
                System.out.println("Voce saiu!");
                break;
            case 1:
                visualizarEstoque();
                break;
            case 2:
                realizarVenda();
                break;
            case 3:
                verCarrinho();
                break;
            case 4:
                finalizarVenda();
                break;
            case 5:
                int codigo;
                String nome;
                int quantidade;
                double valorParaVenda;
                Scanner dadosEntradaProduto = new Scanner(System.in);

                System.out.print("Informe o codigo do produto: ");
                codigo = Integer.parseInt(dadosEntradaProduto.nextLine());

                System.out.print("Informe o nome do produto: ");
                nome = dadosEntradaProduto.nextLine();

                System.out.print("Informe a quantidade de itens do produto: ");
                quantidade = Integer.parseInt(dadosEntradaProduto.nextLine());

                String valor;

                do {
                    System.out.print("Informe o valor unitario do produto: ");
                    valor = dadosEntradaProduto.nextLine();
                    if (valor.contains(",")) {
                        System.out.println("Utilize o . (ponto) ao invés de , (virgula). | Ex.: 4.99 |");
                    }
                } while (valor.contains(","));

                valorParaVenda = Double.parseDouble(valor);
                cadastrarProduto(codigo, nome, quantidade, valorParaVenda);
                break;
            case 6:
                cadastrarFuncionario();
                break;
            case 7:
                cadastrarCliente();
                break;

            default:
                System.out.println("opcao invalida!");
                menuInicial();
                break;
        }
    }

    public void visualizarEstoque() {
        estoque.visualizarEstoque();
    }

    public void realizarVenda() {
        System.out.println("Comecar venda!");
    }

    public void verCarrinho() {
        System.out.println("****************CARRINHO****************");
        System.out.println("******************FIM******************");
    }

    public void finalizarVenda() {
        System.out.println("**************************VENDA********************");
        System.out.println("*****************VENDA FINALIZADA*****************");
    }

    public void cadastrarProduto(int codigo, String nome, int quantidade, double valorParaVenda) {
        estoque.cadastrarProduto(codigo, nome, quantidade, valorParaVenda);
    }

    public void cadastrarFuncionario() {
        System.out.println("Cadastrando Funcionario..");
    }

    public void cadastrarCliente() {
        System.out.println("Cadastrando Cliente...");
    }

}
