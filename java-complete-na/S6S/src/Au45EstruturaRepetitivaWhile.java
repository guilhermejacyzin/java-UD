import java.util.Scanner;

public class Au45EstruturaRepetitivaWhile {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        /*
        While - Enquanto
        Repete o bloco de comandos enquanto a condição for verdadeira

        Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada

        Sintaxe
        while (condição) {
            comando 1
            comando 2
        }

        Regra - Veradeiro (volta) Falso (Pula fora)
         */

        System.out.println("Digite o primeiro valor");
        int x = input.nextInt();

        int soma = 0;
        while (x != 0) {
            soma += x;
            x = input.nextInt();
        }

        System.out.println(soma);

        input.close();



    }
}
