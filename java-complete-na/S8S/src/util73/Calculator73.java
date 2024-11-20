package util73;

public class Calculator73 {

    public static double quantidade = 0;
    public static double valortotal = 0;


//    public double quantidade;

    public static double valortotal(double cotacao) {
//        double quantidade = 0;

        return (quantidade * cotacao * 0.06) + (quantidade * cotacao);
    }

//    public static double valorTotalFinal(double cotacao) {
//        return valortotal * 0.06;
//    }

}
