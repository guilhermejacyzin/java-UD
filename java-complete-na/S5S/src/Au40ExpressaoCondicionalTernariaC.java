import java.util.Scanner;

public class Au40ExpressaoCondicionalTernariaC {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa validador de números ímpares ou pares");
        System.out.println("Digite um número");
        int numeroDig = input.nextInt();

        String validadorDig = (numeroDig % 2 == 0) ? "O número digitado é par" : "O número digitado é impar";

        System.out.println(validadorDig);

        System.out.println();



        input.close();
    }
}
