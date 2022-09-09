package pkgboolean;

public class Boolean {

    public static void main(String[] args) {
        int idade = 16;
        boolean acompanhado = true;
        
        if(idade >= 18 || acompanhado) {
            System.out.println("Seja Bem-vindo!");
        } else if(idade >= 0 && idade < 18 && !acompanhado) {
            System.out.println("Voce nao pode entrar!");
        } else {
            System.out.println("Idade invalida!");
        }
    }
    
}
