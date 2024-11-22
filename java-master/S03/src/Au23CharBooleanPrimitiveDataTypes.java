public class Au23CharBooleanPrimitiveDataTypes {

    public static void main(String[] args) {


        char myChar = 'D';

        System.out.println(myChar);



//        char myChar2 = 'DD';  error


        char myUnicode = '\u0044';
        System.out.println(myUnicode);


        char myDecimalCode = 68;

        System.out.println(myDecimalCode);

        System.out.println("Desafio");

        char myInterChar0 = '?';
        char myInterChar = '\u003F';
        char myInterChar2 = 63;;

        System.out.println("Char normal");
        System.out.println(myInterChar0);
        System.out.println();

        System.out.println("Unicode char");
        System.out.println(myInterChar);

        System.out.println();
        System.out.println("Decimal char");
        System.out.println(myInterChar2);

        System.out.println();
        System.out.println("Boolean");

        boolean myTrueBoolean = true;
        System.out.println(myTrueBoolean);
        boolean myFalseBoolean = false;
        System.out.println(myFalseBoolean);

        boolean isCustomerOverTwentyOne = true;
        System.out.println(myTrueBoolean);

        boolean isMarried = true;

        boolean hasChildren = false;

        System.out.println(isMarried);
        System.out.println(hasChildren);


    }
}
