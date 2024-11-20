import java.util.Locale;
import java.util.Scanner;

public class Au23TrainB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Voltando ao curso com foco total!");

        int y = 32;
        double x = 10.35784;

        System.out.println(y);
        System.out.println(x);

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.printf("%.12f%n", x);


        System.out.println("Resultado " + "é zero");

        System.out.printf("O resultado é de %.2f metros%n", x);


        /*
        %f = ponto flutuante
        %d = inteiro
        %s = texto
        %n = quebra linha
         */

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha %.2f por mês %n", nome, idade, renda);

        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println();
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);

        System.out.println("Record: " + age + " " + "years old, code " + code + " and gender: " + gender);

        System.out.printf("Measue with eight decimal places: %.8f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);

        input.close();
    }
}
