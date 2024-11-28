public class Au40OperatorProcedenceChallenge {

    public static void main(String[] args) {

        double primeiraVar = 20.00d;

        double segundaVar = 80.00d;

        double terceiraVar = primeiraVar + segundaVar;

        System.out.println(terceiraVar);

        System.out.printf("O Resultado de terceiraVar é %.2f\n", terceiraVar);
        System.out.println();

        double quartaVar = 100 * terceiraVar;

        System.out.println(quartaVar);

        System.out.printf("O valor de quartaVar é %.2f", quartaVar);

        System.out.println();
        boolean isQuartaVar = quartaVar % 2 == 0 ? true : false;
        if (isQuartaVar = true) {
            System.out.println("É true");
        }
        else {
            System.out.println("Não é true");
        }

    }

}
