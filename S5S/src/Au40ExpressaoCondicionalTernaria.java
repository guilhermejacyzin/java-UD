import java.util.Scanner;

public class Au40ExpressaoCondicionalTernaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso

        Exemplo:
        (10 != 3) ? "Maria" : "Alex" = "Maria"
         */

        System.out.println("Condicional normal");
        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }
        else {
            desconto = preco * 0.5;
        }

        System.out.println("Desconto: " + desconto);


        System.out.println();
        System.out.println("Condicional ternário");
        double preco2 = 34.5;
        double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.5;
        System.out.println("Desconto 2: " + desconto2);

    }
}
