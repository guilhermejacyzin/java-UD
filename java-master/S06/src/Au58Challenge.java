import java.util.Scanner;

public class Au58Challenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String carName = "Duster";

        switch (carName) {
            case "Duster":
                System.out.println("Welcome to Duster!");
                break;
            case "Corsa":
                System.out.println("Welcome to Corsa!");
                break;
            default:
                System.out.println("No such car!");
        }
    }
}
