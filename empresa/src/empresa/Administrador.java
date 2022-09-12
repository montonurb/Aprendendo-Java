package empresa;

public class Administrador extends Funcionario {

    public Administrador(String nome) {
        super(nome);
    }

    @Override
    public double bonificacao() {
        return super.getSalario() + 50;
    }
    
}
