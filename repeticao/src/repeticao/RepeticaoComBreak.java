package repeticao;

public class RepeticaoComBreak {
    public static void main(String[] args) {
        /*
        for(int i = 1; i <= 10; i++) {
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
        */
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                if(j > i) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
