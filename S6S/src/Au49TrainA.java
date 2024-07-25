import java.util.Scanner;

public class Au49TrainA {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.println("Leitor de senhas");

        System.out.printf("Digite a senha: ");
        int senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha incorreta!");
            System.out.printf("Digite a senha novamente: ");
            senha = input.nextInt();

        }
        System.out.println();
        System.out.println("Acesso Permitido");


        input.close();
    }
}
