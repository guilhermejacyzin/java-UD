public class Au47MetodosJava {

    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;
        
        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Seu score final é de: " + finalScore);
        }

    }

}
