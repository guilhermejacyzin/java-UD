public class Au26AbbreviatingOperators {

    public static void main(String[] args) {

        int result =1;
        result = result + 1;


        System.out.println("Result: " + result);

        result++;   // adicionando + 1 no result com o sufixo ++

        System.out.println(result);

        result--;   // subtraindo -1 no result com o sufixo --;

        System.out.println("Result: " + result);


        int carro = 10;

        carro = carro + 10;

        System.out.println("Carro: " + carro);

        carro++;

        System.out.println("Carro++: " + carro);


        System.out.println("Também pode ser como: ");

        int aviao = 1;
        aviao += 1;

        System.out.println("Aviao +=1 : " + aviao);

        int joia = 50;
        joia -= 20;
        System.out.println("Joia -=20: " + joia);
        joia--;
        System.out.println("Joia--: " + joia);


        int resulta = 10;
        resulta -= 5.5;
        System.out.println("Resulta -= 5.5 : " + resulta);


        double resultx = 10.00d;
        System.out.println(resultx);

        resultx--;
        System.out.println(resultx);

        resultx -= 5.5;
        System.out.println(resultx);

        resultx *= 1.5;
        System.out.println(resultx);

        resultx /= 1.2;
        System.out.println(resultx);

        System.out.println("" +
                "Incremento: ++" +
                "Decremento: --" +
                "Adição +=" +
                "Subtração -=" +
                "Multiplicação *=" +
                "Divisão /=");

    }
}
