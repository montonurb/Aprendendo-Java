package vendas.produtos.crud;

import java.util.Scanner;

public class Menu {

    Estoque estoque = new Estoque();
    Carrinho carrinho = new Carrinho();
    Cliente cliente = new Cliente();
    Funcionario funcionario;

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
                int produtoAutomatizado;

                Scanner dadosEntradaProduto = new Scanner(System.in);

                System.out.println("Cadastro automatizado?");
                System.out.println("1 - SIM");
                System.out.println("2 - NAO");
                System.out.print("Opcao: ");
                produtoAutomatizado = Integer.parseInt(dadosEntradaProduto.nextLine());

                if (produtoAutomatizado == 1) {
                    estoque.produtosAutomatizados();
                    
                    System.out.println("************************");
                    System.out.println("* Produtos cadastrado! *");
                    System.out.println("************************");
                    
                    menuInicial();
                } else if (produtoAutomatizado == 2) {
                    System.out.print("Informe o codigo do produto: ");
                    codigo = Integer.parseInt(dadosEntradaProduto.nextLine());

                    System.out.print("Informe o nome do produto: ");
                    nome = dadosEntradaProduto.nextLine();

                    System.out.print("Informe a quantidade de itens do produto: ");
                    quantidade = Integer.parseInt(dadosEntradaProduto.nextLine());

                    String valor;

                    System.out.print("Informe o valor unitario do produto: ");
                    valor = dadosEntradaProduto.nextLine();
                    if (valor.contains(",")) {
                        valor = valor.replace(",", ".");
                    }

                    valorParaVenda = Double.parseDouble(valor);
                    cadastrarProduto(codigo, nome, quantidade, valorParaVenda);

                    separador();
                    menuInicial();
                } else {
                    System.out.println("opcao invalida!");
                    menuInicial();
                }
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

    public void separador() {
        System.out.println("\n***************************************");
    }

    public void visualizarEstoque() {
        estoque.visualizarEstoque();
        menuInicial();
    }

    public void realizarVenda() {
        estoque.visualizarEstoque();
        carrinho.adicionarProdutoCarrinho(estoque);
        menuInicial();
    }

    public void verCarrinho() {
        System.out.println("***********ITENS DO CARRINHO***********");
        System.out.println("******************FIM******************");

        menuInicial();
    }

    public void finalizarVenda() {
        System.out.println("******************ITENS DA VENDA***************");
        System.out.println("*****************VENDA FINALIZADA*****************");
    }

    public void cadastrarProduto(int codigo, String nome, int quantidade, double valorParaVenda) {
        estoque.cadastrarProduto(codigo, nome, quantidade, valorParaVenda);
    }

    public void cadastrarFuncionario() {

    }

    public void cadastrarCliente() {
        System.out.println("Cadastrando Cliente...");
    }

}
