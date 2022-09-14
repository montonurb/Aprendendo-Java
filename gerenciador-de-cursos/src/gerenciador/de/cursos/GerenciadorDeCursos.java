package gerenciador.de.cursos;

import java.util.ArrayList;
import java.util.Collection;

public class GerenciadorDeCursos {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);
        
        for(String aula : aulas) {
            System.out.println(aula);
        }
        
        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
    }

}
