import java.util.Scanner;

public class Au50EstruturaRepetivivaForC {
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
        //  para cada int i = 0; enquanto i for menor que 5; i recebe incremento de valor de i
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor de i: " + i);
        }

        System.out.println();

        //  para cada int i = 20; enquanto i for maior que 10; i perde incremento de valor de i
        for (int i = 20; i > 10; i --) {
            System.out.println("Valor de i: " + i);
        }



       input.close();
    }
}
