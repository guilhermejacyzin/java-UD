import java.util.Scanner;


public class Au61FuncsVersionB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com 3 números");
        int num = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int maior = max(num, num2, num3);

        showResult(maior);

        input.close();


    }

    /*
    public para que a função fique disponível para outras classes e o
    static para que fique disponível independente de chamar um objeto
     */

    public static int max(int a, int b, int c) {
        //   variável local da minha função // cada função tem o seu escopo // existe somente na execução da minha função
        int aux;

        if (a > b && a > c) {
            aux = a;
        }
        else if (b > a && b > c) {
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }

    //  Quando a função faz uma ação sem retornar um valor para ser reaproveitado no programa, é tipo vazio = void
    public static void showResult(int valor) {
        System.out.println("Maior valor: " + valor);
    }
}
