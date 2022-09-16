package vendas.produtos.crud;

import java.util.ArrayList;

public class Cliente {
    private ArrayList<Cartorio> cartorios = new ArrayList<>();
    
    public void cadastroAutomatico() {
        cartorios.add(new Cartorio("2 Oficio", "Teresina"));
    }
    
    public void cadastrarCliente(String nome, String cidade) {
        cartorios.add(new Cartorio(nome, cidade));
    }
}
