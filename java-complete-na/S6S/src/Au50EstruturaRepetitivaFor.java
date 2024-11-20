import java.util.Scanner;

public class Au50EstruturaRepetitivaFor {
    public static void main(String[] args) {

        /*
        Sintexe
        for (inicio; condição; incremento) {
            comando 1
            comando 2
        }
         */

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i ++) {
            int x = input.nextInt();
            soma += x;
        }
        System.out.println(soma);



        input.close();



    }
}
