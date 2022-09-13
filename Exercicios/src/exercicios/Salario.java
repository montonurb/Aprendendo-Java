package exercicios;

/*
Criar um programa que calcule a média de salários de uma empresa,
pedindo ao usuário a grade de funcionários e os salários, e devolvendo
a média salarial.
*/

public class Salario {
    private double mediaSalario;
    private double funcionario1;
    private double funcionario2;
    private double funcionario3;
    private double funcionario4;
    private double funcionario5;
    
    public void salarioFuncionarios(double funcionario1, double funcionario2, double funcionario3, double funcionario4, double funcionario5) {
        this.funcionario1 = funcionario1;
        this.funcionario2 = funcionario2;
        this.funcionario3 = funcionario3;
        this.funcionario4 = funcionario4;
        this.funcionario5 = funcionario5;
        
        calcularMediaSalario();
    }
    
    public void calcularMediaSalario() {
        this.mediaSalario = (this.funcionario1 +
                this.funcionario2 + 
                this.funcionario3 + 
                this.funcionario4 + 
                this.funcionario5) / 5;
        
        mostrarResultado();
    }
    
    public void mostrarResultado() {
        System.out.println("A media dos funcionarios eh R$" + this.mediaSalario);
    }
}
