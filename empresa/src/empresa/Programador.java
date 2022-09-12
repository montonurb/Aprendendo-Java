package empresa;

public class Programador extends Funcionario {

    public Programador(String nome) {
        super(nome);
    }

    @Override
    public double bonificacao() {
        return super.getSalario() * 0.20 + super.getSalario();
    }
    
}
