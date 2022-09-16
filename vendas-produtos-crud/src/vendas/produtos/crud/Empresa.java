package vendas.produtos.crud;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public void cadastrarFuncionario(String nome, String funcao) {
        funcionarios.add(new Funcionario(nome, funcao));
    }
}
