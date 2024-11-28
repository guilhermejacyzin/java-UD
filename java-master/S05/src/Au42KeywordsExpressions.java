public class Au42KeywordsExpressions {

    public static void main(String[] args) {

        //        int int2 = 5;
//
//        System.out.println(int2);

        double quilometros = (100 * 1.609344);

        System.out.println(quilometros);

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        System.out.println(highScore);

        int health = 100;

        if ((health < 25) && (health > 1000)) {
            highScore = highScore - 1000;
        }

        System.out.println(highScore);
    }
}
