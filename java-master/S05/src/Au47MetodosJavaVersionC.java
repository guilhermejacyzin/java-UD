public class Au47MetodosJavaVersionC {

    public static void main(String[] args) {

        /*
        Para compreender uma melhor visualização quando utilizar os métodos
        o void nunca retorna nada
         */

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);


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
