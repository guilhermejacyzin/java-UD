import java.util.Locale;
import java.util.Scanner;

public class Au28FuncoesAritmeticasJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        A = Math.sqrt(x) - Raíz quadrada
        A = Math.pow(x, y) - Potência
        A = Math.abs(x) - Valor absoluto
         */

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raíz quadrada de " + x + " = " + A);
        System.out.println("Raíz quadrada de " + y + " = " +  B);
        System.out.println("Raíz quadrada de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println(5 + " elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + y + " = " + B);




        input.close();
    }
}
