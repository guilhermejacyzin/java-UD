import java.util.Locale;
import java.util.Scanner;

public class Au29Train02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
//        deste círculo com quatro casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159

        double pi = 3.14159265359;

        System.out.println("Digite o valor do raio: ");
        double raio = input.nextDouble();

        System.out.println("O valor do raio é: " + (pi * Math.pow(raio, 2)));
    }
}
