import java.util.Locale;

public class Au23Train {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.0;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f", product1, price1);
        System.out.println();
        System.out.printf("%s, which price is $%.2f", product2, price2);
        System.out.println();
        System.out.println();
        System.out.printf("Record: 30 years old, code 5290 and gender: %s", gender);
        System.out.println();
//        System.out.println("Record: 30 years old, code 5290 and gender: F");
        System.out.println();
        System.out.printf("Measue with eight decimal places: %.8f", measure);
        System.out.println();
        System.out.printf("Rouded (three decimal places): %.3f", measure);
        System.out.println();
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
