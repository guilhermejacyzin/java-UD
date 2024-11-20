package S9S;

import S9S.entities79.Au79Product;

import java.util.Locale;
import java.util.Scanner;

public class Au79Encapsulamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        /*
        Encapsulamento = É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo
        apenas as operações seguras e que mantenham os objetos em um estado consistente.

        Regra de ouro: o objeto deve sempre estar em estado consistente e a própria classe deve garantir isso.

        Um objeto não deve expor nenhum atributo - private

        Os abritutos devem ser acessados por meio dos métodos get e set

        get para consultar e retornar o valor do atributo
        set para alterar o valor do atributo
        */

        Au79Product p = new Au79Product();

        System.out.print("Digite o nome do produto: ");
        var produto = input.nextLine();

        System.out.print("Digite o preço do produto: ");
        var preco = input.nextDouble();

        System.out.print("Digite o quantidade do produto: ");
        var quantidade = input.nextInt();

        Au79Product product = new Au79Product(produto, preco, quantidade);


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
