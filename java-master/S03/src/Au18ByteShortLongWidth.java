public class Au18ByteShortLongWidth {

    public static void main(String[] args) {


        System.out.println("Olá mundo!");

        System.out.println("Integer Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");

        System.out.println("Long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        System.out.println("Short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");

        long myLongValue = 100L;

        System.out.println(myLongValue);
        System.out.println("A long has a width of " + Long.SIZE); //    Verificando o tamanho de long
        System.out.println("A short has a height of " + Short.SIZE);
        System.out.println("A bytes has a width of " + Byte.SIZE);

//        long bigLongLiteralValue = 2_147_483_647_234;  == Erro, pois trata como um número inteiro. Adicionar 'L' no final!
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);


        System.out.println();

        System.out.println("Outros modelos: ");
        System.out.println("Float Value Range (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");

        System.out.println("Double Value Range (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        System.out.println("Byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");



    }
}
