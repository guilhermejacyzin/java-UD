import entities67.Au67Product;

import java.util.Locale;
import java.util.Scanner;

public class Au67ProgramaEstoque {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Au67Product product = new Au67Product();

        System.out.print("Digite o nome do produto: ");
        product.produto = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        product.preco = input.nextDouble();

        System.out.print("Digite o quantidade do produto: ");
        product.quantidade = input.nextInt();

        System.out.println(product.toString());


//        System.out.printf("Dados do produto: %s, R$ %.2f, %d unidades, Total: ", product.produto, product.preco, product.quantidade);
//
//        System.out.println();
//
//        System.out.print("Digite o número de produtos adicionados no estoque: ");
//
//        System.out.println();

//        System.out.println("Dados do produto atualizados: %s, R$ %.2f, %d unidades, Total: ", produto, preco, quantidade);

//        System.out.print("Digite o número de produtos que quer remover: ");

//        System.out.println("Dados do produto atualizados: %s, R$ %.2f, %d unidades, Total: ", produto, preco, quantidade);



        input.close();
    }
}
