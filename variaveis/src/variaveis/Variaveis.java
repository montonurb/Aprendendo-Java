package variaveis;
public class Variaveis {

    public static void main(String[] args) {
        /*
        TIPOS NUMERICOS
            int     => 1
            double  => 1.0
            long    => 1000000000L
            float   => 1.000F;
            
        */
        
        String nome = "Bruno  Monteiro";
        int idade = 25;
        double peso = 94.0;
        double altura = 1.70;
        double imc = peso / (altura * altura);
        System.out.println(nome + " tem " + idade + " anos e pesa " + peso + "kg.");
        System.out.println("Resultado IMC: " + imc);
    }
    
}
