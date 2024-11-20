import java.util.Scanner;

public class Au39SwitchCaseB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomePeca ="";
        int codigoPeca, quantidadePeca;

        int precoPeca = 0;
        System.out.println("Consulta peças estoque");
        System.out.printf("Digite o código do Peça: ");
        codigoPeca = input.nextInt();

        switch (codigoPeca) {
            case 1:
                nomePeca = "Parafuso";
                precoPeca = 5;
                break;
            case 2:
                nomePeca = "Radiador";
                precoPeca = 350;
                break;
            case 3:
                nomePeca = "Capo";
                precoPeca = 1500;
                break;
            case 4:
                nomePeca = "Porta";
                precoPeca = 700;
                break;
            case 5:
                nomePeca = "Volante";
                precoPeca = 500;
                break;
        }

        System.out.println("Qual a quantidade?");
        quantidadePeca = input.nextInt();


        System.out.println("Você comprou: ");
        System.out.println("Peça: " + nomePeca);
        System.out.println("Quantidade: " + quantidadePeca);
        System.out.println("Valor total: R$" + quantidadePeca * precoPeca);



    }
}
