package S9S;

import S9S.entities81.Au81ModificadoresdeAcesso;

import java.util.Locale;
import java.util.Scanner;

public class Au81ModificadordeAcesso {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Au81ModificadoresdeAcesso p = new Au81ModificadoresdeAcesso();

        System.out.print("Digite o nome do produto: ");
        var produto = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        var preco = input.nextDouble();

        System.out.print("Digite o quantidade do produto: ");
        var quantidade = input.nextInt();

        Au81ModificadoresdeAcesso product = new Au81ModificadoresdeAcesso(produto, preco, quantidade);

//        System.out.println(product.produto);  não acessível


//        product.setProduto("Computer");   TESTE
//        System.out.println(product.getProduto());     TESTE

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
