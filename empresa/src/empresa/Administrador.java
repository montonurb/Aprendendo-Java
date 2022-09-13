package empresa;

public class Administrador extends Funcionario implements Autenticacao {
    
    private AutenticacaoUtil autenticacao;

    public Administrador(String nome) {
        super(nome);
        this.autenticacao = new AutenticacaoUtil();
    }

    @Override
    public double bonificacao() {
        return super.getSalario() + 50;
    }

    @Override
    public void setSenha(String senha) {
        this.autenticacao.setSenha(senha);
    }

    @Override
    public boolean autentica(String senha) {
        return this.autentica(senha);
    }
    
}
