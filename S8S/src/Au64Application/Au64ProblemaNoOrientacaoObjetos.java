package Au64Application;

import java.util.Locale;
import java.util.Scanner;

public class Au64ProblemaNoOrientacaoObjetos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC;
        double yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo X");
        xA = input.nextDouble();
        xB = input.nextDouble();
        xC = input.nextDouble();



        System.out.println("Entre com as medidas do triângulo Y");
        yA = input.nextDouble();
        yB = input.nextDouble();
        yC = input.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo X área: %.4f%n", areaX);
        System.out.printf("Triangulo Y área: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Largura da maior área é X");
        }
        else {
            System.out.println("Largura da maior área é Y");
        }


        input.close();

    }
}
