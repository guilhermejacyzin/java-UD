public class Au38OperadorTernario {

    public static void main(String[] args) {

        System.out.println("operand1 ? operand2 : operand3");

        String makeOfCar = "Volkswagen";

        //  boolean isDomestic = makeOfCar é igual a Volkswagen ? sim: não
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

        //  se true (verdadeiro)
        if (isDomestic) {
            //  imprima: Este carro é original desse local
            System.out.println("Este carro é original desse local");
        }

        System.out.println();

        int ageOfCliente = 20;
        String ageText = ageOfCliente >= 18 ? "Maior de Dezoito" : "Menor de Dezoito";
        System.out.println("Seu cliente é " + ageText);


        String myCar = "Duster";
        boolean isMyCar = myCar == "Duster" ? true : false;

        if (isMyCar) {
            System.out.println("Meu carro é " + isMyCar);
        }

        String myCar2 = "Duster";
        boolean isMyCar2 = myCar2 == "Duster" ? true : false;
        if (isMyCar2) {
            System.out.println("Meu carro é uma Duster? " + isMyCar2);

        }

        System.out.println();

        String myCar3 = "Duster";
        String s = (myCar3.equals("Duster")) ? "Meu carro é uma Duster" : "Meu carro não é uma Duster";

        System.out.println(s);



    }

}
