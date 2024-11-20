import java.util.Scanner;

public class Au29Train05 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int codPeca, quantPeca, codPeca2, quantPeca2;
        double valorPeca, valorPeca2;

        System.out.println("Calculando o valor das peças do estoque");

        System.out.println("Digite o código da peça");
        codPeca = input.nextInt();

        System.out.println("Digite a quantidade de peças");
        quantPeca = input.nextInt();

        System.out.println("Digite o valor unitário da peça");
        valorPeca = input.nextDouble();

        System.out.println("Digite o código da peça");
        codPeca2 = input.nextInt();

        System.out.println("Digite a quantidade de peças");
        quantPeca2 = input.nextInt();

        System.out.println("Digite o valor unitário da peça");
        valorPeca2 = input.nextDouble();

        double valorTotal = quantPeca * valorPeca;
        double valorTotal2 = quantPeca2 * valorPeca2;
        double totalFinal = valorTotal + valorTotal2;

        System.out.println("Código da primeira entrada: " + codPeca);
        System.out.println("Código da segunda entrada: " + codPeca2);
        System.out.println("Quantidade de peças é de: " + (quantPeca + quantPeca2));
        System.out.printf("O valor total de peças digitadas é de: %.2f", totalFinal);





        input.close();
    }
}
