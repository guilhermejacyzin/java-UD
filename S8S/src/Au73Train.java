import util73.Calculator73;

import java.util.Locale;
import java.util.Scanner;

public class Au73Train {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Calculator73 calc = new Calculator73();

        /*
        Compra de dólares
        */

        System.out.print("Qual a cotação do dólar? ");
        double cotacao = input.nextDouble();

        System.out.print("Quanto você quer comprar? ");
        calc.quantidade = input.nextDouble();

        System.out.printf("Você terá que pagar: %.2f", calc.valortotal(cotacao));





    }
}
