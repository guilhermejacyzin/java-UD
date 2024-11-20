import java.util.Locale;
import java.util.Scanner;

public class Au29Train01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Digite um número");
        a = input.nextInt();

        System.out.println("Digite mais um número");
        b = input.nextInt();

        int soma = a + b;

        System.out.println("Seu resultado é: " + soma);

        System.out.println();






    }
}
