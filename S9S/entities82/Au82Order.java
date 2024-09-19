package S9S.entities82;

public class Au82Order {

    private int number;
    public String nomeConta;
    private double saldoInicial = 0;

    public Au82Order(int number, String nomeConta) {
        this.number = number;
        this.nomeConta = nomeConta;
    }

    public Au82Order(int number, String nomeConta, double depositoInicial) {
        this.number = number;
        this.nomeConta = nomeConta;
        depositar(depositoInicial);
    }

    public int getNumber() {
        return number;
    }

//    public void setNumber(int number) {
//        this.number = number;
//    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

//    public void setSaldoInicial(double saldoInicial) {
//        this.saldoInicial = saldoInicial;
//    }
    public void depositar(double amount) {
        saldoInicial += amount;
    }

    public void sacar(double amount) {
        saldoInicial -= amount;
    }
}
