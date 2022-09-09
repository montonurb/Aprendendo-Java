package condicional;

public class Condicional {

    public static void main(String[] args) {
        int idade = 15;

        if (idade >= 0 && idade < 18) {
            System.out.println("Menor de idade!");
        } else if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Idade invalida!");
        }
    }

}
