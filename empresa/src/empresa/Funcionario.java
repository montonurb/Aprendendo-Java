package empresa;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario() {}
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return this.salario;
    }
    
    public double bonificacao() {
        return this.salario * 0.1;
    }
}
