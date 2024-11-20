import java.util.Locale;

public class Au24ProcessamentoDadosCasting {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        //  tipo inteiro
        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);

        //  tipo double
        double z;
        z = 2 * x;
        System.out.println(z);

        //  exemplo 3
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2 * h;

        System.out.println(area);


        //  exemplo 4 - fazendo o casting
        int a, j;
        double resultado;

        a = 5;
        j = 2;
        resultado = (double) a / j;
        System.out.println(resultado);

        //  exemplo 5 - fazendo o casting para int
        double g, d;
        int resultado2;

        g = 5;
        d = 2;
        resultado2 = (int) (g / d);
        System.out.println(resultado2);
    }
}
