package S9S.entities79;

public class Au79Product {

    public String produto;
    public double preco;
    public int quantidade;

    public Au79Product() {
        //construtor padrão
    }

    public Au79Product(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

//    public Au79Product(String produto, double preco) {
//        this.produto = produto;
//        this.preco = preco;
//        quantidade = 0; /*opcional*/
//    }

    public double totalValueInStock() {
        return preco * quantidade;
    }

    public void addProducts(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return produto + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: " + String.format("%.2f",totalValueInStock());

    }

}
