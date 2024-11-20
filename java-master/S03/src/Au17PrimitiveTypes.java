public class Au17PrimitiveTypes {
    public static void main(String[] args) {

        int myValue = 10000;
        System.out.println(myValue);

        int myMinintValue = Integer.MIN_VALUE;
        int myMaxintValue = Integer.MAX_VALUE;

        System.out.println(myMinintValue); // Valor mínimo de um número inteiro

        System.out.println("Valor mínimo de um número inteiro: " + myMinintValue);

        System.out.println("Valor mínimo de um número inteiro: " + Integer.MIN_VALUE);

        System.out.println("Valor mínimo de um número inteiro: " + Integer.MAX_VALUE);

        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        System.out.println("Integer Value Range (" + myMinintValue + " to " + myMaxintValue + ")");

        System.out.println("Busted Max Value = " + (myMaxintValue + 1));

        System.out.println("Busted Min Value = " + (myMinintValue - 1));

//        int myTestMaxValue = 2147483648;  Número muito grande = erro

//        System.out.println("myTestMaxValue = " + myTestMaxValue);

        System.out.println();
        System.out.println("Sobre a legibilidade usando o modelo underline entre números: 2_147_483_647 // 2_1_4_7_4_8_3_6_4_7");

        int myMaxIntTest = 2_147_483_647;

        int myMaxIntTest2 = 2_1_4_7_4_8_3_6_4_7;

        System.out.println(myMaxIntTest);
        System.out.println(myMaxIntTest2);
    }
}
