package S9S.entities82;

public class Au82Order {
//    public void order_id;
//    private int order_id;
    private int contaBanco;
    public String nomeConta;
    private double depositoInicial = 0;

    public Au82Order(int contaBanco, String nomeConta) {
        this.contaBanco = contaBanco;
        this.nomeConta = nomeConta;
//        this.depositoInicial = depositoInicial;
    }
}
