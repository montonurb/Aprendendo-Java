package exercicios;

public class Exercicios {

    public static void main(String[] args) {
        
        //EXERCICIO 01
        //Temperatura graus = new Temperatura();
        //graus.calcular(32.0);
        
        //EXERCICIO 02
        Conjunto colecao = new Conjunto();
        colecao.dados.put(1.70, "M");
        colecao.dados.put(1.40, "M");
        colecao.dados.put(1.51, "F");
        colecao.dados.put(1.78, "F");
        colecao.dados.put(1.80, "M");
        colecao.dados.put(1.62, "F");
        colecao.dados.put(1.60, "F");
        colecao.dados.put(1.71, "M");
        colecao.dados.put(1.58, "M");
        colecao.dados.put(1.55, "F");
        
        colecao.verificarMaiorEMenorAltura();
        colecao.mediaAlturaHomens();
        colecao.totalMulheres();
        
        //EXERCICIO 03
        //Salario mediaSalario = new Salario();
        //mediaSalario.salarioFuncionarios(1200, 1200, 2400, 2400, 3200);
        
        //EXERCICIO 04
        //Azulejos totalAzulejos = new Azulejos();
        //totalAzulejos.tamanhos(3.5, 4.0, 1.0, 0.8);
        
        //EXERCICIO 05
        //Volume volume = new Volume();
        //volume.informarDados(1.4, 2);
        
        //EXERCICIO 06
        //Cavalos quantidadeCavalos = new Cavalos();
        //quantidadeCavalos.informarDados(10, 1.8, 60);
        
        //EXERCICIO 07
        //Idade idadePessoas = new Idade();
        //idadePessoas.pessoas.put(21, "Leonardo Codeiro");
        //idadePessoas.pessoas.put(27, "Fabio Pimentel");
        //idadePessoas.pessoas.put(19, "Silvio Mattos");
        //idadePessoas.pessoas.put(23, "Romulo Henrique");
        
        //idadePessoas.buscarValores();
        
        //System.out.println(idadePessoas.getPessoas());
    }  
}
