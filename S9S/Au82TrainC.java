package S9S;

import java.util.Locale;
import java.util.Scanner;

public class Au82TrainC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner(System.in);

        System.out.println("Digite o número da conta");
        System.out.println("Digite o nome do proprietário da conta");
        System.out.println("Você fará um depósito inicial? S/N");

        System.out.println("Dados da conta: ");
        System.out.printf("Conta %d, Proprietário(a): %s, Saldo: $ %.2f");


        System.out.print("Digite o valor a ser sacado: ");

        System.out.println("Dados da conta atualizados: ");
        System.out.printf("Conta %d, Proprietário(a): %s, Saldo: $ %.2f");




        input.close();
    }
}
