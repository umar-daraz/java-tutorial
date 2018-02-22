package inventory;

import java.util.HashMap;

public class ProductRepository {
    HashMap<Integer, Product> products = new HashMap<>();

    public ProductRepository() {
        products.put(1, new Product(new ProductID(1),"Surf Excel", 10));
        products.put(2, new Product(new ProductID(2),"Vim", 30));
    }

    public Product read(ProductID productID) {
        return products.get(productID.id);
    }
}
