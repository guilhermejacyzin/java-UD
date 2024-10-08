import java.util.Locale;

public class TestesABCPerform {

    public static void main(String[] args) {

        System.out.print("Olá mundo");
        System.out.println();
        System.out.println("Olá mundo");
        System.out.println("Good morning");
        System.out.println();
        System.out.print("Olá mundo!");
        System.out.println("Bom dia");

        //  Variável int - inteiro
        int y = 32;
        System.out.println("Conteúdo da variável: " + y);
        System.out.println();

        //  Variável de ponto flutuante
        double x = 10.35784;
        System.out.println(x);
        System.out.println();
        //  Controlando as casas decimais
        System.out.printf("%.2f", x);
        System.out.println();
        System.out.printf("%.4f", x);

        //  Trocando o separador para US
        Locale.setDefault(Locale.US);
        //  Variável de ponto flutuante
        double b = 10.35784;
        System.out.println(x);
        System.out.println();
        //  Controlando as casas decimais
        System.out.printf("%.2f", b);
        System.out.println();
        System.out.printf("%.4f", b);
        System.out.println();

        //  Juntanto - Concatenando vários elementos em um mesmo comando de escrita
        System.out.println("Resultado: " + b);

        System.out.println();
        //  Concatenando vários elementos em um mesmo comando de escrita
        System.out.printf("Resultado = %.2f metros %n", x);

        System.out.println();
        // Concatenando vários elementos em um mesmo comando de escrita
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        //  s é marcador para String
        //  d é marcador para int = inteiro
        //  f é marcador para flutuante (double)
    }
}
