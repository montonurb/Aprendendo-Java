package vendas.produtos.crud;

import java.util.ArrayList;

public class Cartorio {
    private String nome;
    private String cidade;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    Cartorio(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    
    public void cadastroAutomatizado() {
        funcionarios.add(new Funcionario("Lucio Rayone", "Tabeliao Substituto"));
        funcionarios.add(new Funcionario("Meirylane", "Tabelia"));
    }
    
    public void cadastrarFuncionarios(String nome, String funcao) {
        funcionarios.add(new Funcionario(nome, funcao));
    }
}
