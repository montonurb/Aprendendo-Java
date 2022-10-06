package com.montonurb.atividades;

public class Atividades {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        
        novoCliente.nome = "Bruno Monteiro";
        novoCliente.cpf = "000.111.222-33";
        novoCliente.telefone = "86999116978";
        novoCliente.sexo = "Masculino";
        novoCliente.anoDeNascimento = "1996-10-15";
        
        String dados = novoCliente.imprimirDados(novoCliente);
        System.out.println(dados);
        int idade = novoCliente.calculaIdade(novoCliente.anoDeNascimento);
        System.out.println(idade + " anos");
        String maioridade = novoCliente.verificarMaioridade(novoCliente.anoDeNascimento);
        System.out.println(maioridade);
    }
}
