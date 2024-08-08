import entities67.Au67Product;

import java.util.Locale;
import java.util.Scanner;

public class Au67ProgramaEstoqueB {

    public static void main(String[] args) {

        //  Programa para estoque exemplo

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Au67Product product = new Au67Product();

        System.out.print("Digite o nome do produto: ");
        product.produto = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        product.preco = input.nextDouble();

        System.out.print("Digite o quantidade do produto: ");
        product.quantidade = input.nextInt();

        System.out.println("Dados do produto: " + product.toString());

        System.out.println();

        System.out.print("Digite o número de produtos adicionados no estoque: ");
        int quantidade = input.nextInt();
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
