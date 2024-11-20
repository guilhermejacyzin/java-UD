import java.util.Scanner;

public class Au61Funcs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double y = 25;
        double x = Math.sqrt(y);


        System.out.println(x);


        System.out.println();
        System.out.println("Entre com 3 números");
        int num = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num > num2 && num > num3) {
            System.out.println("O maior número é: " + num);
        }
        else if (num2 > num && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        }
        else {
            System.out.println("O maior número é: " + num3);
        }


//        System.out.println("O maior número é: ");


        input.close();
    }
}
