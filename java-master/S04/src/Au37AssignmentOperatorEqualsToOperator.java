public class Au37AssignmentOperatorEqualsToOperator {
    public static void main(String[] args) {

        int newValue = 50;

        if (newValue == 50) {
            System.out.println("O valor é igual a 50");
        }

        boolean isCar = false;
        if (isCar = true) {
            System.out.println("Isso não deveria acontecer 1");
        }

        if (isCar != true) {
            System.out.println("Isso não deveria acontecer 2");
        }

        if (!isCar) {
            System.out.println("Isso não deveria acontecer 3");
        }

    }
}
