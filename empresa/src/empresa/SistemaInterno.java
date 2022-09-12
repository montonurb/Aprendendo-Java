package empresa;

public class SistemaInterno {
    private String senha = "13";
    
    public void autentica(Gerente gerente) {
        boolean autenticou = gerente.autenticacao(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema!");
        } else {
            System.out.println("Você nao pode entrar no sistema!");
        }
    }
}
