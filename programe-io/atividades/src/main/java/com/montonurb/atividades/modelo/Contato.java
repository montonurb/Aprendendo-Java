package com.montonurb.atividades.modelo;

import javax.swing.JOptionPane;

public class Contato {
    private String tipo;
    private String numero;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void imprimirDados(Contato contato) {
        JOptionPane.showMessageDialog(null, "Tipo: " + this.tipo + " | Número: " + this.numero);
    }
}
