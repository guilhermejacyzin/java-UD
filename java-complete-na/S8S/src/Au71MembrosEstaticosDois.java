import util71.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Au71MembrosEstaticosDois {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = calc.circunferencia(radius);

        double v = calc.volume(radius);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calc.PI);

        input.close();
    }


}
