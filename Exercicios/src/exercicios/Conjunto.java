package exercicios;

import java.util.HashMap;
import java.util.Map;

/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
de 10 pessoas. Fazer um algoritmo que calcule e escreva:
    a. a maior e a menor altura do grupo;
    b. média de altura dos homens;
    c. o número de mulheres.
*/
public class Conjunto {
    Map<Double, String> dados = new HashMap<>();
    
    public void verificarMaiorEMenorAltura() {
        double maiorAltura = 0.0;
        for (double altura : dados.keySet()) {
            if(altura >= maiorAltura) {
                maiorAltura = altura;
            }
        }
        double menorAltura = maiorAltura;
        for (double altura : dados.keySet()) {
            if(altura <= menorAltura) {
                menorAltura = altura;
            }
        }
        
        System.out.println("Maior altura: " + maiorAltura + ".");
        System.out.println("Menor altura: " + menorAltura + ".");
    }
    
    public void mediaAlturaHomens() {
        int quantidadeHomens = 0;
        double somaAlturas = 0.0;
        for(Map.Entry dadosUnico : dados.entrySet()) {
            if(dadosUnico.getValue() == "M") {
                somaAlturas += Double.parseDouble(dadosUnico.getKey().toString());
                quantidadeHomens++;
            }
        }
        double mediaAlturaHomens = somaAlturas / quantidadeHomens; 
        System.out.println("Media das alturas dos homens: " + mediaAlturaHomens + ".");
    }
    
    public void totalMulheres() {
        int totalMulheres = 0;
        for(Map.Entry dadosUnico : dados.entrySet()) {
            if(dadosUnico.getValue() == "F") {
                totalMulheres++;
            }
        }
        System.out.println("Total de mulhers: " + totalMulheres + ".");
    }
}
