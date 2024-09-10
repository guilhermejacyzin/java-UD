package S9S;

import S9S.entities76.Au76Product;

import java.util.Locale;
import java.util.Scanner;

public class Au76Construtores {
    public static void main(String[] args) {

    /*
    Palavra This, Sobrecarga, Encapsulamento
     */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Digite o nome do produto: ");

        System.out.print("Digite o preço do produto: ");

        System.out.print("Digite o quantidade do produto: ");

        System.out.println("Dados do produto: " + product.toString());

        System.out.println();

        System.out.print("Digite o número de produtos adicionados no estoque: ");
        product.addProducts(quantidade);

        System.out.println();

        System.out.println("Dados do produto atualizados: " + product.toString());
        System.out.println();

        System.out.print("Digite o número de produtos que quer remover: ");
        quantidade = input.nextInt();
        product.removeProducts(quantidade);


        System.out.println();
        System.out.println("Dados do produto atualizados: " + product.toString());

        input.close();
    }

}
