package empresa;

public class Cliente implements Autenticacao {

    private String senha;
    
    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    
}
