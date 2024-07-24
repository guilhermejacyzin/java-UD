import java.util.Scanner;

public class Au35EstruturaCondicional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        if (5>10) {
            System.out.println("Oi");
        }

        int x = 5;

        System.out.println("Bom dia");
        if (x < 0) {
            System.out.println("Boa tarde");
        }

        System.out.println("Boa noite");


        System.out.println();
        System.out.println("Composta - Trata apenas 2 possibilidades");

        int hora;

        System.out.println("Quantas horas? ");
        hora = input.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        }
        else {
            System.out.println("Boa tarde");
        }

        System.out.println();
        System.out.println("Encadeamento de estruturas condicionais");

        int hora2;

        System.out.println("Quantas horas?");
        hora2 = input.nextInt();

        if (hora2 < 12) {
            System.out.println("Bom dia");
        }
        else {
            if (hora2 < 18) {
                System.out.println("Boa tarde");
            }
            else {
                System.out.println("Boa noite");
            }
        }


        int hora3;

        System.out.println("Quantas horas?");
        hora3 = input.nextInt();

        if (hora3 < 12) {
            System.out.println("Bom dia");
        }
        else if (hora3 < 18) {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }


        input.close();

    }
}
