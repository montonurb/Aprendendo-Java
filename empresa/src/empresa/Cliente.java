package empresa;

public class Cliente implements Autenticacao {

    private AutenticacaoUtil autenticacao;
    
    Cliente() {
        this.autenticacao = new AutenticacaoUtil();
    }
    
    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }

    @Override
    public boolean autentica(String senha) {
        return this.autenticacao.autentica(senha);
    }
}