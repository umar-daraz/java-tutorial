package inventory;

public class LineItem {
    int quantity;
    Product product;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Integer price() {
       return quantity * product.price;
    }

}