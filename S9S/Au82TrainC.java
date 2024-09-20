package S9S;

import S9S.entities82.Au82Order;

import java.util.Locale;
import java.util.Scanner;

public class Au82TrainC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input =  new Scanner(System.in);
        Au82Order account;

        System.out.println("Digite o número da conta");
        int number = input.nextInt();

        System.out.println("Digite o nome do proprietário da conta");
        input.nextLine();
        String nomeConta = input.nextLine();

        System.out.println("Você fará um depósito inicial? S/N");
        char opcao = input.next().charAt(0);
        if (opcao == 'S') {
            System.out.println("Digite o valor inicial");
            double depositoInicial = input.nextDouble();
            account = new Au82Order(number, nomeConta, depositoInicial);
        }
        else {
            account = new Au82Order(number, nomeConta);
        }

        System.out.println();

        System.out.println("Dados da conta: ");
        System.out.printf("Conta %d, Proprietário(a): %s, Saldo: $ %.2f");


        System.out.print("Digite o valor a ser sacado: ");

        System.out.println("Dados da conta atualizados: ");
        System.out.printf("Conta %d, Proprietário(a): %s, Saldo: $ %.2f");




        input.close();
    }
}
