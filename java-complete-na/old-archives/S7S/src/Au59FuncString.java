import java.util.Scanner;

public class Au59FuncString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String original = "abcde FGHIJ ABC abc DEFG";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace ('a','x'): -" + s06 + "-");
        System.out.println("replace ('abc','xy'): -" + s07 + "-");
        System.out.println("Index of 'bc: " + i);
        System.out.println("Last index of 'bc: " + j);

        System.out.println();

        System.out.println("Operação SPLIT");
        //  SPLIT serve para recortar o String
        String s = "potato apple lemon";

        String[] vect = s.split(" "); //    uso o espaço em branco (" ") como separador
        String word = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println("Word recortado pelo split: " + word);
        System.out.println("Word2 recortado pelo split: " + word2);
        System.out.println("Word3 recortado pelo split: " + word3);


        String w = "alacanata maparata salada fatarararrata";

        String[] vectore = w.split("a");

        String palavra = vectore[0];
        String palavra2 = vectore[2];
        String palavra3 = vectore[3];
        String palavra5 = vectore[5];
        String palavra7 = vectore[7];

        System.out.println(palavra);
        System.out.println(palavra2);
        System.out.println(palavra3);
        System.out.println(palavra5);
        System.out.println(palavra7);


        input.close();


    }
}
