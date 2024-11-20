import entities66.Au66Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Au66CriandoMetodoReaproveitamentoDelegacao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // Com criação do método para simplificação

        //  Chamando a classe
        Au66Triangle x, y;

        //  Instanciando a classe
        x = new Au66Triangle();
        y = new Au66Triangle();

        System.out.println("Entre com as medidas do triângulo X");
        x.a = input.nextDouble();
        x.b = input.nextDouble();
        x.c = input.nextDouble();



        System.out.println("Entre com as medidas do triângulo Y");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        double areaX = x.area();

        double areaY = y.area();


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
