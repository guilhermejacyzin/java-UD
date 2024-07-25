import java.util.Scanner;

public class Au49TrainB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem vindo ao posto XPTO!");
        System.out.println("Você vai abastecer com o que?");
        System.out.println("Digite 1 - Álcool");
        System.out.println("Digite 2 - Gasolina");
        System.out.println("Digite 3 - Diesel");
        System.out.println("Digite 4 - Fim do atendimento");

        System.out.printf("Escolha a opção: ");
        int combustivel = input.nextInt();

        int alcool = 0, gasolina = 0, diesel = 0;
        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            }
            else {
                System.out.println("Fim");
            }
        }

        System.out.println("Muito obrigado!");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);


        input.close();
    }
}
