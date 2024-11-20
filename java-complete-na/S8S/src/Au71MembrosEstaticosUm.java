import java.util.Locale;
import java.util.Scanner;

public class Au71MembrosEstaticosUm {

    public static double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = circunferencia(radius);

        double v = volume(radius);

        System.out.printf("Circunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", PI);

        input.close();
    }

    public static double circunferencia(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
