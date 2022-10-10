/*
    Para cada produto informado (nome, preço e
    quantidade), escreva o nome do produto
    comprado e o valor total a ser pago,
    considerando que são oferecidos descontos
    pelo número de unidades compradas, segundo
    a tabela abaixo:

        Até 10 unidades: valor total
        de 11 a 20 unidades: 10% de desconto
        de 21 a 50 unidades: 20% de desconto
        acima de 50 unidades: 25% de desconto
 */
package com.montonurb.atividades;

public class Produto {
    String nome;
    double preco;
    Integer quantidade;
    
    public double calcularValorTotal(Produto produto) {
        double valor = produto.quantidade * produto.preco;
        double valorComDesconto = valor;
        
        if( produto.quantidade > 50) {
            valorComDesconto = valor - valor * 0.25;
        } else if (produto.quantidade >= 21 && produto.quantidade <= 50 ){
            valorComDesconto = valor - valor * 0.2;
        } else if (produto.quantidade >= 11 && produto.quantidade <= 20 ) {
            valorComDesconto = valor - valor * 0.1;
        } else if (produto.quantidade <= 10) {
            valorComDesconto = valor;
        }
        return valorComDesconto;
    }
}
