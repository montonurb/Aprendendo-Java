package com.montonurb.atividades.modelo;

import javax.swing.JOptionPane;

public class Agenda {
    Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
    
    public void imprimirAgenda(Contato contato) {
        contato.imprimirDados(contato);
    }
}
