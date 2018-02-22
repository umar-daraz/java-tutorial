package inventory;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<LineItem> lineItems = new ArrayList<>();
    Stock stock;

    public Order (Stock stock) {
        this.stock = stock;
    }
    public void newLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public int total() {
       return lineItems.stream()
                .map(lineItem -> lineItem.price())
                .reduce(0, (x, y) -> (x + y));
    }

    public void checkout() {
        lineItems.forEach(lineItem -> {
            stock.decrement(lineItem.product.productID, lineItem.quantity);
        });
    }
}
