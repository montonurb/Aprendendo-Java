package exercicios;

/*
Calcular e apresentar o valor do volume de uma lata de óleo, utilizando fórmula:
V = 3.14159 * R * R * A,
em que as variáveis: V, R e A representam respectivamente o volume, o raio e a
altura. Vamos declarar as variáveis V, R e A como double e definir um valor
qualquer para as variáveis de altura e de raio. Agora vamos escrever a fórmula,
conforme dita no enunciado e, em seguida, exibir na tela uma mensagem contendo
o resultado do volume encontrado.
*/

public class Volume {
    private double volume;
    private double pi = 3.14159;
    private double raio;
    private double altura;
    
    public void informarDados(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
        calcularVolume();
    }
    
    public void calcularVolume() {
        this.volume = pi * raio * raio * altura;
        mostrarResultado();
    }
    
    public void mostrarResultado() {
        System.out.println("O volume da lata de oleo eh " + this.volume);
    }
}
