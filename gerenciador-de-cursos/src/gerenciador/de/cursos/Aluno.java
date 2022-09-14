package gerenciador.de.cursos;

public class Aluno {
    private String nome;
    private String matricula;
    
    Aluno(String nome, String matricula) {
        if(nome == null || matricula == null) {
            throw new NullPointerException("Nome não pode ser vazio");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return this.nome + " (" + this.matricula + ")" ;
    }
    
    
}
