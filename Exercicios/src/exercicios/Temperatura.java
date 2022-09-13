package exercicios;

/*
Escreva um programa que, com base em uma temperatura em graus celsius,
a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F),
seguindo as fórmulas:
    K = C + 273.15;
    Re = C * 0.8;
    Ra = C * 1.8 + 32 + 459.67
    F = C * 1.8 + 32;
*/

public class Temperatura {
    private double grauC;
    private double grauK;
    private double grauRe;
    private double grauRa;
    private double grauF;
    
    Temperatura(){}
    
    public void celsiuParaKelvin() {
        this.grauK = grauC + 273.15;
    }
    
    public void celsiusParaReamur() {
        this.grauRe = grauC * 0.8;
    }
    
    public void celsiusParaRankine() {
        this.grauRa = grauC * 1.8 + 32 + 459.67;
    }
    
    public void celsiusParaFahrenheit() {
        this.grauF = grauC * 1.8 + 32;
    }
    
    public void calcular(double grauC) {
        this.grauC = grauC;
        celsiuParaKelvin();
        celsiusParaReamur();
        celsiusParaRankine();
        celsiusParaFahrenheit();
        imprimirResultado();
    }
    
    public void imprimirResultado() {
        System.out.println("CONVERSAO DE " + this.grauC + "C :");
        System.out.println("K: " + this.grauK);
        System.out.println("F: " + this.grauF);
        System.out.println("Re: " + this.grauRe);
        System.out.println("Ra: " + this.grauRa);
    }
}
