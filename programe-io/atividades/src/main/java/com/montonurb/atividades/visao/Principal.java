package com.montonurb.atividades.visao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String nome;
        double salario;
        double totalVendas;
        
        nome = in.readLine();
        salario = Double.parseDouble(in.readLine());
        totalVendas = Double.parseDouble(in.readLine());
        
        salario += (totalVendas * 0.15);
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        String salarioFinal = df.format(salario);
        
        System.out.println("TOTAL = R$ " + salarioFinal);

        /*
        Contato contato = new Contato();
        contato.setTipo("Celular");
        contato.setNumero("86 9 9911-6978");
        
        Agenda agenda = new Agenda();
        agenda.setContato(contato);
        agenda.imprimirAgenda(contato);
         */
    }

}
