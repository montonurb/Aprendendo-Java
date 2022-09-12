package empresa;

public class Empresa {

    public static void main(String[] args) {
        Gerente bruno = new Gerente("Bruno Monteiro");
        bruno.setSalario(2500);
        
        System.out.println("Bonificacao: " + bruno.bonificacao());

    }
    
}
