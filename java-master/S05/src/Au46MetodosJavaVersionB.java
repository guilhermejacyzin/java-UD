public class Au46MetodosJavaVersionB {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        int finalScore2 = score;


        calculateScore(true, 800, levelCompleted, bonus);

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

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Seu score final é de: " + finalScore);
        }

    }

}
