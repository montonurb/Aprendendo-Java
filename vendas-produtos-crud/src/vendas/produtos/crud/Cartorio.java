package vendas.produtos.crud;

import java.util.ArrayList;

public class Cartorio {
    private String nome;
    private String endereco;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void cadastrarFuncionarios(String nome, String funcao) {
        funcionarios.add(new Funcionario(nome, funcao));
    }
}
