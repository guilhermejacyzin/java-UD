import java.util.Locale;
import java.util.Scanner;

public class Au25EntradaDadosUm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        //  Lendo String
        String x;
        x = input.next();
        System.out.println("O valor de String digitado foi: " + x);

        //  Lendo int
        int z;
        z = input.nextInt();
        System.out.println("O valor digitado de int foi: " + z);

        //  Lendo double
        double b;
        b = input.nextDouble();
        System.out.println("O valor digitado double foi: " + b);
        System.out.printf("O valor digitado double foi %.4f", b);
        System.out.println();

        //  Lendo um char
        char a;
        a = input.next().charAt(0);
        System.out.println("O valor digitado char foi: " + a);


        //  Lendo vários dados na mesma linha
        String q;
        int w;
        double e;

        System.out.println("Digite um nome: ");
        q = input.next();
        System.out.println("Digite um número inteiro: ");
        w = input.nextInt();
        System.out.println("Digite um número double ou float");
        e = input.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(q);
        System.out.println(w);
        System.out.println(e);

        input.close();
    }
}
