package gerenciador.de.cursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GerenciadorDeCursos {

    public static void main(String[] args) {
        /*  PRIMEIRA AULA
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
         */

 /* SEGUNDA AULA
        Aula aula1 = new Aula("Trabalhando com ArrayList", 24);
        Aula aula2 = new Aula("Lista de objetos", 19);
        Aula aula3 = new Aula("Relacionamentos com colecoes", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTitulo));
        System.out.println(aulas);
         */
 /* TERCEIRA AULA
        Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 24));
        javaColecoes.adiciona(new Aula("Listas de Objetos", 19));
        javaColecoes.adiciona(new Aula("Relacionanmentos com Colecoes", 23));

        System.out.println(javaColecoes.getAulas());
        
        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        
        javaColecoes.gettotalAulas();
         */
        
        Curso javaColecoes = new Curso("Java Collections", "Paulo Silveira");
 
        javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 24));
        javaColecoes.adicionaAula(new Aula("Listas de Objetos", 19));
        javaColecoes.adicionaAula(new Aula("Relacionanmentos com Colecoes", 23));
        
        javaColecoes.matriculaAluno(new Aluno("Bruno Monteiro", "1056924"));
        javaColecoes.matriculaAluno(new Aluno("Jailson Silva", "1056925"));
        
        System.out.println(javaColecoes.getAlunos());
    }

}
