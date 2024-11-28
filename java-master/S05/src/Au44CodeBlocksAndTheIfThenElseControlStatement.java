public class Au44CodeBlocksAndTheIfThenElseControlStatement {

    public static void main(String[] args) {

        System.out.println("Olá mundo!");

        System.out.println("If // Else // If-else");

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Seu score é de 5000 pontos");
        }

        System.out.println();
        System.out.println("O score é menor que 5000?");
        if (score < 5000) {
            System.out.println("Seu score é menor que 5000");
        }
        else {
            System.out.println("Não, é maior que 5000");
        }

        System.out.println();
        System.out.println("Usando if // else if // else");
        if (score < 5000 && score > 1000) {
            System.out.println("Seu score está entre 5000 e 1000");
        }
        else if (score < 1000) {
            System.out.println("Seu score está abaixo de 1000");
        }
        else {
            System.out.println("Seu score é acima de 5000");
        }

    }



}
