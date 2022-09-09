package caracteres;

public class Valores {
    public static void main(String[] args) {
        int primeiro = 5;
        int segundo = 7;
        
        segundo = primeiro;
        primeiro = 10;
        
        System.out.println("Segundo: " + segundo);
        System.out.println("Primeiro: " + primeiro);
    }
}
