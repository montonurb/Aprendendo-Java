package empresa;

public class Empresa {

    public static void main(String[] args) {
        Gerente niko = new Gerente("Niko");
        niko.setSalario(4500.0);
        
        niko.setSenha("13");
        
        SistemaInterno si = new SistemaInterno();
        si.autentica(niko);
        
        System.out.println("Bonificacao: " + niko.bonificacao());
        
        Programador bruno = new Programador("Bruno Monteiro");
        bruno.setSalario(3200.0);
        
        System.out.println("Bonificacao: " + bruno.bonificacao());
    }
    
}
