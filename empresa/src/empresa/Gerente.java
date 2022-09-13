package empresa;

public class Gerente extends Funcionario implements Autenticacao {
    
    private AutenticacaoUtil autenticacao;
    
    public Gerente(String nome) {
        super(nome);
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
    
    @Override
    public double bonificacao() {
        return this.getSalario() + this.getSalario() * 0.1;
    }
}
