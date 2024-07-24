import java.util.Scanner;

public class Au38SintaxeOpcional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Minutagem de telefonia");
        int minutosUtilizados;
        int conta = 50;

        System.out.println("Quantos minutos você utilizou esse mês?");
        minutosUtilizados = input.nextInt();

        if (minutosUtilizados <= 100) {
            System.out.println("O valor a pagar é de R$50,00");
        }
        else if (minutosUtilizados > 100) {
            conta += (minutosUtilizados - 100) * 2;
        }
        else {

        }
        System.out.println("O valor da conta é de R$ " + conta);
    }
}
