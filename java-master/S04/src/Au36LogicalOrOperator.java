public class Au36LogicalOrOperator {

    public static void main(String[] args) {

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("topScore é Maior que secondTopScore e menor que 100");
        }

        System.out.println();

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Com o operador 'or' Uma das duas condições é verdadeira");
        }

    }

}
