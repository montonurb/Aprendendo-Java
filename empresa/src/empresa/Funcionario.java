package empresa;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome) {}
    
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
    
    public abstract double bonificacao();
}
