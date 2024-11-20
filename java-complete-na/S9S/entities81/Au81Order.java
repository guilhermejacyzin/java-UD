package S9S.entities81;

import java.util.Date;

public class Au81Order {
    private Date date;
//    private Product product;

    public Au81Order(Date date/*", Product product"*/) {
        this.date = date;
       // this.product = product;
//        this.product.produto = "TV";
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
}
