package gerenciador.de.cursos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<String, Aluno> matriculaAluno = new HashMap<>();
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
    
    public void matriculaDoAluno(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaAluno.put(aluno.getMatricula(), aluno);
    }
    
    public int getTotalAulas() {
        return tempototal; 
    }
    
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    
    public boolean alunoMatriculado(String nome) {
        ArrayList listaNomeAlunos = new ArrayList<>();
        for(Aluno aluno : alunos) {
            listaNomeAlunos.add(aluno.getNome());
        }
        return listaNomeAlunos.contains(nome);
    }
    
    public Aluno buscarAluno(String matricula) {
        if(!this.matriculaAluno.containsKey(matricula)) {
            throw new NoSuchElementException("Nenhuma matricula encontrada");
        }
        return this.matriculaAluno.get(matricula);
    }
}
