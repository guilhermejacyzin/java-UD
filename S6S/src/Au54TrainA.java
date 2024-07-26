import java.util.Scanner;

public class Au54TrainA {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        //  Para (int i igual a 1; enquanto i menor igual a num; i recebe i)
        for (int i = 1; i <= num; i++) {
            //  se (i módulo de 2 diferente de zero)
            if (i % 2 != 0) {
                //  imprima i
                System.out.println(i);
            }
        }


        input.close();
    }
}
