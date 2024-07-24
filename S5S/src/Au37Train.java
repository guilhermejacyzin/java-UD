import java.util.Scanner;

public class Au37Train {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa validador de números negativos");
        int n;

        System.out.println("Digite um número");
        n = input.nextInt();
        if (n < 0) {
            System.out.println("O número digitado é negativo");
        }
        else {
            System.out.println("O número digitado é positivo");
        }

        System.out.println();

        System.out.println("Programa validador de números ímpares ou pares");
        int n2;
        System.out.println("Digite um número");
        n2 = input.nextInt();
        if (n2 % 2 == 0) {
            System.out.println("O número digitado é par");
        }
        else {
            System.out.println("O número digitado é ímpar");
        }

        System.out.println();

        System.out.println("Programa validador de números múltiplos");
        int n3, n4;
        System.out.println("Digite um número");
        n3 = input.nextInt();
        System.out.println("Digite mais um número");
        n4 = input.nextInt();

        if (n3 % n4 == 0 || n4 % n3 == 0) {
            System.out.println("Os números são múltiplos");
        }
        else {
            System.out.println("Os números não são múltiplos");
        }

        System.out.println();

        System.out.println("Leitor de espaço de tempo");
        int horaInicio, horaFinal, duracao;

        System.out.println("Digite a hora de entrada");
        horaInicio = input.nextInt();

        System.out.println("Digite a hora de saída");
        horaFinal = input.nextInt();

        if (horaInicio < horaFinal) {
            duracao = horaFinal - horaInicio;
        }
        else {
            duracao = 24 - horaInicio + horaFinal;
        }
        System.out.println("O leitor declara que você teve um espaço de tempo de " +
                duracao + " horas entre início e fim");

        System.out.println();



        System.out.println("Leitor de itens de uma lanchonete");
        int quantidadeItem;
        int codigoItem;
        double valorTotal = 0;

        System.out.println("Digite o código do item desejado");
        codigoItem = input.nextInt();

        System.out.println("Digite a quantidade");
        quantidadeItem = input.nextInt();

        if (codigoItem == 1) {
            valorTotal = quantidadeItem * 4.00;
        }
        else if (codigoItem == 2) {
            valorTotal = quantidadeItem * 4.50;
        }
        else if (codigoItem == 3) {
            valorTotal = quantidadeItem * 5.00;
        }
        else if (codigoItem == 4) {
            valorTotal = quantidadeItem * 2.00;
        }
        else if (codigoItem == 5) {
            valorTotal = quantidadeItem * 1.50;
        }

        System.out.printf("O valor é de %.2f", valorTotal);





        input.close();
    }
}
