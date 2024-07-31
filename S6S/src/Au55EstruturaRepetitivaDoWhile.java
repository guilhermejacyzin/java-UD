import java.util.Locale;
import java.util.Scanner;

public class Au55EstruturaRepetitivaDoWhile {
    public static void main(String[] args) {


        /*
        Sintaxe - Regra // Do while
        do {
            comando1
            comando2
        } while (condicao)

        Regra
        Verdadeiro - Volta
        Falso - Pula fora
         */

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Conversor de temperatura");

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double Fahrenheit = 9.0 * celsius / 5.0 + 32.0;

        System.out.printf("Equivalente em Farenheit: %.2f", Fahrenheit);

        System.out.println();

        System.out.print("Deseja repetir? (s/n) ");
        char resp = input.next().charAt(0);


        while (resp != 'n') {
            System.out.print("Digite a temperatura em Celsius: ");
            celsius = input.nextDouble();

            Fahrenheit = 9.0 * celsius / 5.0 + 32.0;

            System.out.printf("Equivalente em Farenheit: %.2f", Fahrenheit);
            System.out.println();

            System.out.print("Deseja repetir? (s/n) ");
            resp = input.next().charAt(0);
        }


        input.close();



    }
}
