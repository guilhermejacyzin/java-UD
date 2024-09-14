package S9S.entities82;

public class Au82Order {

    private int contaBanco;
    public String nomeConta;
    private double depositoInicial = 0;

    public Au82Order() {

    }

    public Au82Order(int contaBanco, String nomeConta) {
        this.contaBanco = contaBanco;
        this.nomeConta = nomeConta;
//        this.depositoInicial = depositoInicial;
    }

    public int getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(int contaBanco) {
        this.contaBanco = contaBanco;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getDepositoInicial() {
        return depositoInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.depositoInicial = depositoInicial;
    }
}
