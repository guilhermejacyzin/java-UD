import java.util.Scanner;

public class Au55TrainB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        int numDigitadoIn = 0, numDigitadoOut = 0;

        System.out.println("Digite um número");
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            if (numDigitadoIn >= 10 && numDigitadoIn <= 20) {
                numDigitadoIn += numDigitadoIn;
            }
            else {
                numDigitadoOut += numDigitadoOut;
            }
        }





        input.close();
    }
}
