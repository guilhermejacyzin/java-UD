package S9S.entities81;

public class Au81ModificadoresdeAcesso {

    private String produto;
    private double preco;
    private int quantidade;

    public Au81ModificadoresdeAcesso() {
        //construtor padrão
    }

    public Au81ModificadoresdeAcesso(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

//    public Au79Product(String produto, double preco) {
//        this.produto = produto;
//        this.preco = preco;
//        quantidade = 0; /*opcional*/
//    }


    // Dentro do programa principal - para retornar o nome do produto
    public String getProduto() {
        return produto;
    }

    // Dentro do programa principal - para alterar o nome do produto
    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // BLOQUEAR ALTERAÇÃO Para proteger o meu produto de alterações indevidas - FRAUDE
//    public void setQuantidade(int quantidade) {
//        this.quantidade = quantidade;
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
