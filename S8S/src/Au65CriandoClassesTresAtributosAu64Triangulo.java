import entities65.Au65Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Au65CriandoClassesTresAtributosAu64Triangulo {
    public static void main(String[] args) {
                /*
        Solução com orientação a objetos
         */


        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //  Chamando a classe
        Au65Triangle x, y;

        //  Instanciando a classe
        x = new Au65Triangle();
        y = new Au65Triangle();

        System.out.println("Entre com as medidas do triângulo X");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();



        System.out.println("Entre com as medidas do triângulo Y");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

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
