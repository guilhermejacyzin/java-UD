import java.util.Scanner;

public class AuEstruturaRepetitivaTrainC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o número de carros a seguir: ");
        int numCarros = input.nextInt();



        System.out.println("Iremos somar a quantidade");
        int soma = 0;
        while (numCarros > 15) {
            soma = numCarros + soma;
            System.out.println("Digite novamente");
            numCarros = input.nextInt();
        }

        System.out.println(soma);




        input.close();
    }
}
