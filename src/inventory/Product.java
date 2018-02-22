package inventory;

public class Product {
    String name;
    int price;
    ProductID productID;

    public Product(ProductID productID, String name, int price) {
        this.name = name;
        this.price = price;
        this.productID  = productID;
    }
}
