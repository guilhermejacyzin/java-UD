import java.util.Scanner;

public class Au29Train03 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);



        int A, B, C, D;

        System.out.println("Vamos calcular a diferença do produto A e B, pelo produto de C e D. Atente-se" +
                "aos valores e complete abaixo");

        System.out.println("Digite um número");
        A = input.nextInt();

        System.out.println("Digite um número");
        B = input.nextInt();

        System.out.println("Digite um número");
        C = input.nextInt();

        System.out.println("Digite um número");
        D = input.nextInt();

        System.out.println("Diferença = " + (A * B - C * D));


    }
}
