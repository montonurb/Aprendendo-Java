package exercicios;

/*
Uma parede em formato retangular, cuja altura é hp (altura da parede)
e a largura lp (largura da parede) precisa ser coberta por azulejos
também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
e la (largura do azulejo). Escreva um programa que leia as quatro medidas
hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas são
necessários para cobrir a parede dada.
*/
public class Azulejos {
    private double alturaParede;
    private double larguraParede;
    private double alturaAzulejo;
    private double larguraAzulejo;
    private double quantidadeAzulejos;
    
    public void tamanhos(double alturaParede, double larguraParede, double alturaAzulejo, double larguraAzulejo) {
        this.alturaParede = alturaParede;
        this.larguraParede = larguraParede;
        this.alturaAzulejo = alturaAzulejo;
        this.larguraAzulejo = larguraAzulejo;
        
        calcularQuantidadeAzulejos();
    }
    
    public void calcularQuantidadeAzulejos() {
        this.quantidadeAzulejos = (alturaParede * larguraParede) /
                (alturaAzulejo * larguraAzulejo);
        mostrarResultado();
    }
    
    public void mostrarResultado() {
        System.out.println("Eh necessario " + this.quantidadeAzulejos + " de azulejos.");
    }
}
