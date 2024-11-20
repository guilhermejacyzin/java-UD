import java.util.Scanner;

public class Au39SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Leitura de dias da semana");

        int x;
        String dia;
        System.out.println("Digite o dia da semana");
        x = input.nextInt();
        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "valor inválido";
                break;

        }
        System.out.println("O dia é " + dia);

        input.close();
    }
}
