package S10S;

import java.util.Locale;
import java.util.Scanner;

public class Au89VetoresParte1 {
    public static void main(String[] args) {
        /*
        Revisão de conceito de vetor
        Declaração e instanciação
        Manipulação de vetor de elementos tipo valor (tipo primitivo)
        Manipulação de vetor de elementos tipo referência (classe)
        Acesso aos elementos
        Propriedade length
         */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para começar");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = input.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double media = sum / vect.length;

        System.out.printf("Média: %.2f", media);
        input.close();
    }
}
