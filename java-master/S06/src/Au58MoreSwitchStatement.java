public class Au58MoreSwitchStatement {

    public static void main(String[] args) {

        System.out.println("Usando switch statement");
        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("O valor é 1");
            case 2 -> System.out.println("O valor é 2");
            case 3, 4, 5, 6, 7, 8, 9 -> System.out.println("O valor é " + switchValue);

//                System.out.println("Atualmente é " + switchValue);
            default -> System.out.println("O valor não é 1, 2, 3, 4, 5, 6, 7, 8 ou 9");
        }

        String month = "Abril";
        System.out.println(month + " está no " + getQuarter(month) + " Quarter");

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "Janeiro", "Fevereiro", "Março" -> "1 - Primeiro";
            case "Abril", "Maio", "Junho" -> "2 - Segundo";
            case "Julho", "Agosto", "Setembro" -> "3 - Terceiro";
            case "Outubro", "Novembro", "Dezembro" -> "4 - Quarto";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

}
