import java.util.Locale;
import java.util.Scanner;

public class Au55EstruturaRepetitivaDoWhileVersionCCorrect {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = input.nextDouble();

            double Fahrenheit = 9.0 * celsius / 5.0 + 32.0;

            System.out.printf("Equivalente em Farenheit: %.2f", Fahrenheit);
            System.out.println();

            System.out.print("Deseja repetir? (s/n) ");
            resp = input.next().charAt(0);

        } while (resp != 'n');


        input.close();


    }
}
