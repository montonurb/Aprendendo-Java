package exercicios;

/*
Escreva um programa para determinar a quantidade de cavalos necessários para se
levantar uma massa de m quilogramas a uma altura de h metros em t segundos.
Considere cavalos = (m * h / t) / 745,6999
*/
public class Cavalos {
    
    private double quantidadeCavalos;
    private double massa;
    private double altura;
    private int segundos;
    
    public void informarDados(double massa, double altura, int segundos) {
        this.massa = massa;
        this.altura = altura;
        this.segundos = segundos;
        
        calcularCavalos();
    }
    
    public void calcularCavalos() {
        this.quantidadeCavalos = (this.massa * this.altura / this.segundos) / 745.6999;
        
        mostrarResultado();
    }
    
    public void mostrarResultado() {
        System.out.println("Eh necessario " + this.quantidadeCavalos + ".");
    }
}
