import java.util.Scanner;

public class Au49TrainD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Posto de Combustível");

        int tipo;
        int alcool = 1, gasolina = 2, diesel = 3;
        System.out.println("As opções são: ");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Sair");
        System.out.print("Digite qual o tipo de combustível: ");
        tipo = input.nextInt();

        //  enquanto tipo for diferente de 4
        while (tipo != 4) {
            //  se tipo == 1
            if (tipo == 1) {
                //  álcool recebe álcool + 1
                alcool += 1;
                //  se não se tipo == 1
            } else if (tipo == 2) {
                //  gasolina recebe gasolina + 1
                gasolina += 1;
                //  se não se tipo == 3
            } else if (tipo == 3) {
                //  diesel recebe diesel + 1
                diesel += 1;
            }
            //  se não
            else {
                //  imprima o texto abaixo
                System.out.println("Inválido");
            }
            //  pulo fora do if
            //  continuo adicionando
            System.out.print("Continue adicionando: ");
            //  tipo recebe input
            tipo = input.nextInt();
        }

        //  imprime texto
        System.out.println("As quantidades são: ");
        //  imprime texto + quantidade acumulada
        System.out.println("Álcool: " + alcool);
        //  imprime texto + quantidade acumulada
        System.out.println("Gasolina: " + gasolina);
        //  imprime texto + quantidade acumulada
        System.out.println("Diesel: " + diesel);

    }
}
