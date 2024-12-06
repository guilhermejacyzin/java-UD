public class Au61TheForStatement {
    public static void main(String[] args) {
        System.out.println("Instruções: \n" +
                "" +
                "for (init; expression; increment) {" +
                "//block of statements" +
                "}");

        System.out.println();

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println("10,000 at 2% interest: " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest: " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest: " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest: " + calculateInterest(10000.0, 5.0));

        System.out.println();
        System.out.println("Fazendo com Loop For");
        //  para (double rate = 2; enquanto rate <= 5; rate recebe o incremento
        for (double rate = 2.0; rate <=5.0; rate++) {
            //  double interestAmount = calculateInterest(10000.0; rate)
            double interestAmount = calculateInterest(10000.0, rate);
            //  imprime o resultado
            System.out.println("10,000 at " + rate + "% interest: " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
