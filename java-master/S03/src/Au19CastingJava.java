public class Au19CastingJava {

    public static void main(String[] args) {

        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;


        System.out.println(myMinShortValue);
        System.out.println(myMinIntValue);

        byte myminByteValue = Byte.MIN_VALUE; int mymaxIntValue = Byte.MAX_VALUE;

        System.out.println(myminByteValue);
        System.out.println(mymaxIntValue);

        short firstShort = 1; int firstInteger = 2;

        System.out.println(firstShort);
        System.out.println(firstInteger);

        byte firstByte = 1;
        byte secondByte = 2;

        System.out.println(firstByte);
        System.out.println(secondByte);

        System.out.println();
        int myTotal = (myMinIntValue / 2);

        System.out.println(myTotal);

//        byte myNewByteValue = (myminByteValue / 2);   error

//        byte myNewByteValue = (-128/2); certo

//        System.out.println(myNewByteValue); certo

        byte myNewByteValue = (byte) (myminByteValue / 2); //   fazendo o casting

        System.out.println("Fazendo o casting acima: " + myNewByteValue);





    }
}
