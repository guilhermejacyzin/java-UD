package S9S.entities76;

public class Au76Product {

    public String produto;
    public double preco;
    public int quantidade;

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
