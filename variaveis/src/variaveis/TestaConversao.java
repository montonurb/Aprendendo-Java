package variaveis;

public class TestaConversao {
    public static void main(String[] args) {
        double salario = 2070.50;
        int valor = (int) salario; //casting => como se fosse o 'as int' do dart
        System.out.println("salario: " + salario);
    }
}
