public class Au57SwitchStatement {
    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
        System.out.println("O valor é 1");
        }
        else if (value == 2) {
            System.out.println("O valor é 2");
        }
        else {
            System.out.println("O valor não é 1 ou 2");
        }

        System.out.println();
        System.out.println("Usando switch statement");
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("O valor é 1");
                break;
            case 2:
                System.out.println("O valor é 2");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("O valor é " + switchValue);
//                System.out.println("Atualmente é " + switchValue);
                break;
            default:
                System.out.println("O valor não é 1, 2, 3, 4, 5, 6, 7, 8 ou 9");


        }

    }
}
