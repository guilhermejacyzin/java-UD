package S9S.entities82;

public class Au82Order {
//    public void order_id;
//    private int order_id;
    private int contaBanco;
    public String nome;
    private double depositoInicial;

    public Au82Order(int contaBanco, String nome, double depositoInicial) {
        this.contaBanco = contaBanco;
        this.nome = nome;
        this.depositoInicial = depositoInicial;
    }
}
