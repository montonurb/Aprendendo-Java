package empresa;

public class Administrador extends Funcionario implements Autenticacao {
    
    private String senha;

    public Administrador(String nome) {
        super(nome);
    }

    @Override
    public double bonificacao() {
        return super.getSalario() + 50;
    }

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
