import java.util.Scanner;

public class Au50EstruturaRepetivivaForB {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    /*
    Sintaxe
    for (inicio; condição; incremento de valor) {
        comando 1
        comando 2
    }

    Inicio: executa somente a primeira vez
    Condição: Verdadeiro: executa e volta - Falso: pula fora
    Incremento de valor: executa toda vez depois de voltar
     */

        int numDig = 0;

        System.out.print("Digite um número: ");
        numDig = input.nextInt();

        int soma = 0;
        //  para (cada int i igual a zero; enquanto i for menor que numDig; i recebe i)
        for (int i = 0; i < numDig; i++) {
            System.out.print("Continue digitando: ");
            var x = input.nextInt();
            soma += x;

        }

        System.out.println("A soma dos números digitados é de: " + soma);




    input.close();



    }
}
