package exercicios;

import java.util.HashMap;
import java.util.Map;

public class Idade {
    Map<Integer, String> pessoas = new HashMap<>();

    public Map<Integer, String> getPessoas() {
        return pessoas;
    }
    
    public void buscarValores() {
        for (String nome : this.pessoas.values()) {
            System.out.println(nome);
        }
    }
    
    
}
