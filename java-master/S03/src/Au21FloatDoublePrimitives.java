public class Au21FloatDoublePrimitives {
    public static void main(String[] args) {


        System.out.println("Trabalhando com: \n" +
                "Int \n" +
                "Float \n" +
                "Double");

        System.out.println();
        System.out.println("Float Value Range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");

        System.out.println("Double Value Range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");


        int myIntValue = 5;
        float myFloatValue = 5;
        double myDoubleValue = 5;

        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println();
        myFloatValue = 5f;
        myDoubleValue = 5d;

        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        System.out.println();

        System.out.println("A Expressão myOtherFloatValue = 5.25 apresenta erro, então abaixo existem duas formas" +
                "de lidar com isso: ");

        float myOtherFloatValue = 5.25f;

        System.out.println("Com a expressão float myOtherFloatValue = 5.25f = " + myOtherFloatValue);
        System.out.println("Ou com a experessão");

        float myOtherFloatValues = (float) 5.25;

        System.out.println("Com a expressão float myOtherFloatValues = (float) 5.25 = " + myOtherFloatValues);

        System.out.println("O double é o mais utilizado e não o float, mas outra forma interessante de fazer, segundo" +
                "o vídeo, é utilizar o f no final, como fiz acima. O double em java é mais preciso que o float.");
    }
}
