package variaveis;
public class Variaveis {

    public static void main(String[] args) {
        String nome = "Bruno  Monteiro";
        int idade = 25;
        double peso = 94.0;
        double altura = 1.70;
        double imc = peso / (altura * altura);
        System.out.println(nome + " tem " + idade + " anos e pesa " + peso + "kg.");
        System.out.println("Resultado IMC: " + imc);
    }
    
}
