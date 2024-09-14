package S9S;

import S9S.entities82.Au82Order;

import java.util.Locale;
import java.util.Scanner;

public class Au82Train {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

//        Au82Order order = new Au82Order();

        System.out.println("Bem vindo ao GBank :)");

        System.out.print("Digite o número da sua conta: ");
        var contaBanco = input.nextInt();

        System.out.print("Digite o seu nome: ");
        var nomeConta = input.nextLine();

        input.nextLine();
//        System.out.println();

        System.out.println("Deseja realizar um depósito inicial? S/N");
        var deposito = input.nextLine();
//        input.nextLine();
//
//        System.out.println();

        double depositoInicial = 0;
        if (deposito.equals("S")) {
            System.out.print("Digite o valor do seu depósito inicial: ");
            depositoInicial = input.nextDouble();
        }
        else {
            System.out.println("Obrigado");
        }

        System.out.println("Dados da conta:");
        System.out.printf("Conta: %d, Nome: %s, Valor em conta: ", contaBanco, nomeConta, depositoInicial);






        input.close();
    }
}
