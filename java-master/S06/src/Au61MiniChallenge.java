public class Au61MiniChallenge {

    public static void main(String[] args) {

        for (double rate = 7.5; rate <= 10; rate+= 0.25) {
//            System.out.println(counter);
            double interestAmount = calculateInterest(100.00, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 rate at " + rate + "% interest amount = $" + interestAmount);
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
