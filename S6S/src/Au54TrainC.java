import java.util.Scanner;

public class Au54TrainC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        //  para cada int i igual a um; enquanto i for <= num; i recebe incremento de valor de i
        for (int i = 1; i <= num; i++) {
            //  se (i módulo de 2 diferente de 0) {imprima}
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }





        input.close();
    }
}
