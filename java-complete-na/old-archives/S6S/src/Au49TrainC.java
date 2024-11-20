import java.util.Scanner;

public class Au49TrainC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Leitor de senhas");

        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida!");
            System.out.print("Digite novamente: ");
            senha = input.nextInt();
        }

        System.out.println("Acesso permitido!");


        input.close();
    }
}
