import java.util.Locale;
import java.util.Scanner;

public class Au28Train01 {
    public static void main(String[] args) {
//        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//        mensagem explicativa, conforme exemplos.

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = input.nextInt();

        System.out.println("Digite mais um número: ");
        int num2 = input.nextInt();

        System.out.println("O resultado é: " + (num1 + num2));

//        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
//        deste círculo com quatro casas decimais conforme exemplos.
//        Fórmula da área: area = π . raio2
//        Considere o valor de π = 3.14159

        double pi = 3.14159265359;

        System.out.println("Digite o valor do raio: ");
        double raio = input.nextDouble();

        System.out.println("O valor do raio é: " + (pi * Math.pow(raio, 2)));

//        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
//        calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
//        a fórmula: DIFERENCA = (A * B - C * D).

        int A, B, C, D;

        System.out.println("Digite o valor de A: ");
        A = input.nextInt();
        System.out.println("Digite o valor de B: ");
        B = input.nextInt();
        System.out.println("Digite o valor de C: ");
        C = input.nextInt();
        System.out.println("Digite o valor de D: ");
        D = input.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("A diferença é: " + diferenca);

//        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//        hora e calcula o salário desse funcionário. A seguir, mostre o número e o
//        salário do funcionário, com duas casas decimais.

        String funcionario;
        int horaTrabalhada;
        double valorHoraTrabalhada;
        double salario;

        System.out.printf("Digite o nome do funcionário: ");
        funcionario = input.nextLine();
        input.nextLine();

        System.out.printf("Digite o número de horas trabalhadas: ");
        horaTrabalhada = input.nextInt();

        System.out.printf("Digite o valor da hora trabalhada: ");
        valorHoraTrabalhada = input.nextDouble();

        salario = horaTrabalhada * valorHoraTrabalhada;
        System.out.println("O salário final é de " + salario);


//        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
//        Calcule e mostre o valor a ser pago.

        int codigoPeca, quantidadePeca, codigoPeca2, quantidadePeca2;
        double valorPeca, valorPeca2;


        System.out.println("Digite o codigo da primeira peça: ");
        codigoPeca = input.nextInt();

        System.out.println("Digite a quantidade de peças: ");
        quantidadePeca = input.nextInt();

        System.out.println("Digite o valor da peça da primeira peça: ");
        valorPeca = input.nextDouble();

        System.out.println("Digite o codigo da segunda peça: ");
        codigoPeca2 = input.nextInt();

        System.out.println("Digite a quantidade de peças: ");
        quantidadePeca2 = input.nextInt();

        System.out.println("Digite o valor da peça da segunda peça: ");
        valorPeca2 = input.nextDouble();

        double valorTotal1 = valorPeca * quantidadePeca;
        double valorTotal2 = valorPeca2 * quantidadePeca2;
        double valorFinal = valorTotal1 + valorTotal2;
        System.out.printf("Valor a pagar: %.2f", valorFinal);




        input.close();
    }
}
