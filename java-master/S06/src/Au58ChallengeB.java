import java.util.Scanner;

public class Au58ChallengeB {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String carName = "Duster";

        switch (carName) {
            case "Duster" -> System.out.println("Welcome to Duster!");
            case "Corsa" -> System.out.println("Welcome to Corsa!");
            default -> System.out.println("No such car!");
        }
    }
}
