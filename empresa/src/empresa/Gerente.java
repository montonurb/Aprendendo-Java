package empresa;

public class Gerente extends Funcionario{
    private String senha;
    
    public Gerente(String nome) {
        super(nome);
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean autenticacao(String senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
    
    public double bonificacao() {
        return super.bonificacao() + super.getSalario();
    }
}
