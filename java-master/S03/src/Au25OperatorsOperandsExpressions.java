public class Au25OperatorsOperandsExpressions {

    public static void main(String[] args) {

        System.out.println("Uma expressão é formada pela combinação de variáveis, literais, valores de retorno de métodos" +
                "que ainda não foram abordados e operadores. Uma forma de combinar valores para" +
                "produzir resultados");

        int myVar = 12 + 15;

        System.out.println(myVar);

        int result = 1 + 2;     // 1 + 2 = 3

        System.out.println(result);

        int previousResult = result;

        System.out.println(result);

        result = result - 1;    // 3 - 1 = 2

        System.out.println(result);

        char firstChar = 'A'; char secondChar = 'B';
        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(firstChar + secondChar);

        System.out.println("" + firstChar + secondChar);

        result = 2;

        System.out.println(result);

        result = result * 10;   // 2 * 10 = 20
        System.out.println(result);

        System.out.println(result / 4); // 20 / 4 = 5
        System.out.println(result % 4);


        result = 5;

        result = result % 3;    // o resultado do resto de (5 % 3) = 2
        System.out.println(result);


        System.out.println();


    }
}
