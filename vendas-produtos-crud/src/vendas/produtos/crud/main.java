package vendas.produtos.crud;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("0 - Sair");
        System.out.println("1 - Realizar venda");
        System.out.println("2 - Ver carrinho");
        System.out.println("3 - Finalizar venda");
        System.out.println("4 - Cadastrar produto");
        System.out.println("5 - Cadastrar funcionario");
        System.out.println("6 - Cadastrar cliente");

        System.out.print("Opcao: ");
        
        try {
            opcao = Integer.parseInt(entrada.next());
        } catch(Exception e) {
            System.out.println(e + " nao e um numero inteiro.");
        }
        
        Menu menu = new Menu();
        menu.escolhaDoUsuario(opcao);
    }
}
