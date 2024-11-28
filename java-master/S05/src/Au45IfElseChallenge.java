public class Au45IfElseChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        int finalScore2 = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Seu score final é de: " + finalScore);
        }

        System.out.println();

        if (gameOver) {
            finalScore2 += (levelCompleted * bonus);
            System.out.println("Seu score final é de: " + finalScore);
        }

        System.out.println();



        boolean gameOver2 = true;
        double score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;
        double finalScore3 = score2;

        if (gameOver2) {
            finalScore3 += (levelCompleted2 * bonus2);
            System.out.printf("Seu score final é de: %.2f", finalScore3);
        }


    }

}
