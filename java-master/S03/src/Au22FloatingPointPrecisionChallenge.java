public class Au22FloatingPointPrecisionChallenge {
    public static void main(String[] args) {

        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;


        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        myIntValue = 5 / 2;

        System.out.println(myIntValue);

        myFloatValue = 5f / 2;

        System.out.println(myFloatValue);

        myDoubleValue = 5d / 2;

        System.out.println(myDoubleValue);

        myFloatValue = 5f / 3f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d / 3d;
        System.out.println(myDoubleValue);

        myFloatValue = 5f / 4f;
        System.out.printf("Resultado = %.6f", myFloatValue);

        System.out.println("Os computadores processam double mais rapidamente, já o float é mais menos eficiente. " +
                "As bibliotecas Java funcionam melhor com double.");

        int myLibras = 1;
        double myKilos = 0.45359237;

        double meuPeso = 5 * myLibras * myKilos;

        System.out.println(meuPeso);

        System.out.println();
        System.out.println("Outra forma");
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted = " + convertedKilograms);

        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println("Another number = " + anotherNumber);

        System.out.println("Não usar double ou float para pontos flutuantes, principalmente quando" +
                "escolhermos fazer cálculos precisos demais.");

    }
}
