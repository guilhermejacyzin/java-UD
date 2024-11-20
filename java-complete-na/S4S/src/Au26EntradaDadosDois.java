import java.util.Locale;
import java.util.Scanner;

public class Au26EntradaDadosDois {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        //   Lendo um texto até a quebra de linha

        //  Para ler a linha inteira, tem que ser nextLine
        //  Quando usa next, ele lê até a palavra

        int x;
        String s1, s2, s3;

        x= input.nextInt();
        input.nextLine(); //    resolvendo o next e nextline
        s1 = input.nextLine();
        s2 = input.nextLine();
        s3 = input.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
