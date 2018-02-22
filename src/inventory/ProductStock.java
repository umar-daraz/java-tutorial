package inventory;

public class ProductStock {
    int quantity;
    ProductID productID;
    ProductStock(ProductID productID, int quantity){
        this.quantity = quantity;
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        return productID.id;
    }
}
