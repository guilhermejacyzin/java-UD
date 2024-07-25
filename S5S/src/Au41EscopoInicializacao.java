import java.util.Scanner;

public class Au41EscopoInicializacao {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        Inicialização de variáveis
         */

        double price = 400.00;

        double discount; //Ou inicio a variável aqui, por exemplo: double discount = 0; ou no else

        if (price < 200.00) {
            discount = price * 0.1;
        }
        else {
            discount = 0;
        }

        System.out.println(discount);

        input.close();
    }
}
