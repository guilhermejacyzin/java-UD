import java.util.Scanner;

public class Au54TrainAB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroPar = input.nextInt();

        for (int i = 0; i <= numeroPar; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }


        input.close();
    }
}
