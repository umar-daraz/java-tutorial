package inventory;

import java.util.HashMap;

public class Stock {
    HashMap<Integer, ProductStock> stock = new HashMap<>();

    public Stock() {
        stock.put(1, new ProductStock(new ProductID(1), 20));
        stock.put(2, new ProductStock(new ProductID(2), 30));
    }

    void decrement(ProductID productID, int sold) {
        int quantity = stock.get(productID.id).quantity;
        if(sold > quantity) return;
        stock.put(
                productID.id, new ProductStock(
                        productID,quantity - sold )
        );
    }

    public int productStock(ProductID productID) {
        ProductStock productStock =stock.get(productID.id);
        return productStock.quantity;
    }



}
