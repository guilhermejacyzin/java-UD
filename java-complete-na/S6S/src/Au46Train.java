import java.util.Scanner;

public class Au46Train {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int y = 4;

        while (x < 3) {
            y += 2;
            x += 1;
            System.out.println(x + " - " + y);
        }

        input.close();
    }
}
