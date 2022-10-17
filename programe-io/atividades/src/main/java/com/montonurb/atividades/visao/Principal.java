package com.montonurb.atividades.visao;
import com.montonurb.atividades.modelo.Agenda;
import com.montonurb.atividades.modelo.Contato;

public class Principal {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setTipo("Celular");
        contato.setNumero("86 9 9911-6978");
        
        Agenda agenda = new Agenda();
        agenda.setContato(contato);
        agenda.imprimirAgenda(contato);
        
    }
    
}
