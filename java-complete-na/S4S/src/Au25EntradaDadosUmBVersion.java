import java.util.Scanner;

public class Au25EntradaDadosUmBVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        int y;
        double w;

        System.out.print("Digite um nome: ");
        x = input.next();
        System.out.println("Seu nome é: " + x);

        System.out.println();
        System.out.print("Digite um número: ");
        y = input.nextInt();
        System.out.println("Seu número é: " + y);

        System.out.println();
        System.out.print("Digite um valor: ");
        w = input.nextDouble();
        System.out.printf("Seu valor escolhido é : %.2f %n", w);



        input.close();
    }
}
