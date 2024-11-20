import java.util.Scanner;

public class Au40ExpressaoCondicionalTernariaB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa validador de números negativos");
        int n = input.nextInt();

        String validador = (n < 0) ? "Negativo" : "Positivo";

        System.out.println(validador);


        input.close();
    }
}
