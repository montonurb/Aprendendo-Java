package gerenciador.de.cursos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private int tempototal;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adicionaAula(Aula aula) {
        this.aulas.add(aula);
        this.tempototal += aula.getTempo();
    }
    
    public void matriculaAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public int gettotalAulas() {
        return tempototal; 
    }
    
    public Set<Aluno> getAlunos() {
        return alunos;
    }
}
