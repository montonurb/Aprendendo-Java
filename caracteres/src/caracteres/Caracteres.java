package caracteres;

public class Caracteres {
    public static void main(String[] args) {
        /*
            TIPAGEM
                char => 'a';
        */
        char letra = 'a';
        System.out.println(letra);
        
        char valor = 66;
        System.out.println(valor);
        
        valor = (char) (valor + 1);
        System.out.println(valor);
        
        String frase = "Eu estou aprendendo Java";
        System.out.println(frase);
        
        frase = frase + 2022;
        System.out.println(frase);
    }
    
}
