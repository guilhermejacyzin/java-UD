public class Au48MetodosRecap {

    public static void main(String[] args) {

        /*
        Para compreender uma melhor visualização quando utilizar os métodos
        o void nunca retorna nada
         */

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("High score: " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("O próximo valor de Score é " + calculateScore(gameOver, score, levelCompleted, bonus));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }

        return finalScore;
    }

}
