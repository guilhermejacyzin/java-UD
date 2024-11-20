public class Au16StartingOutWithExpressions {

    public static void main(String[] args) {

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;

        System.out.println(myFirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        System.out.printf("A soma de %d, %d e %d é de %d\n", myFirstNumber, mySecondNumber, myThirdNumber, myTotal);

        myThirdNumber = myFirstNumber * 2;

        System.out.println(myThirdNumber);

        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.printf("A nova soma de %d, %d e %d é de %d\n", myFirstNumber, mySecondNumber, myThirdNumber, myTotal);

        int myLastOne = 1000;

        System.out.println(myLastOne);

        int novoTotal = myTotal - myLastOne;

        System.out.println(novoTotal);

        int novoTotal2 = myLastOne - myTotal;

        System.out.println(novoTotal2);



    }
}
