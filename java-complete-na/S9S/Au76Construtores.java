package S9S;

import S9S.entities76.Au76Product;

import java.util.Locale;
import java.util.Scanner;

public class Au76Construtores {
    public static void main(String[] args) {

    /*
    Palavra This, Sobrecarga, Encapsulamento

    Aula 76
    Aula 77

     */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Digite o nome do produto: ");
        var produto = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        var preco = input.nextDouble();

        System.out.print("Digite o quantidade do produto: ");
        var quantidade = input.nextInt();

        Au76Product product = new Au76Product(produto, preco, quantidade);


        System.out.println("Dados do produto: " + product.toString());

        System.out.println();

        System.out.print("Digite o número de produtos adicionados no estoque: ");
        quantidade = input.nextInt();
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
