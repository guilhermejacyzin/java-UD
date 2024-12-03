public class Au49MethodChallengeB {

    public static void main(String[] args) {

        int preferenciaCarro = faixaPreco(0);
        tipoCarro("Corsa", preferenciaCarro);
    }

    public static void tipoCarro(String nomeCarro, int precoCarro) {
        System.out.println("Carro: " + nomeCarro + " com preço de " + precoCarro);
    }

    public static int faixaPreco (int preco) {

        if (preco == 1) {
            return 1000;
        }
        else if (preco == 2) {
            return 2000;
        }
        else if (preco == 3) {
            return 3000;
        }
//        else {
//            return 4000;
//        }
        // OU pode fazeer como abaixo
        return 4000;
    }

}


