package inventory;

public class ProductID {
    int id ;
   public ProductID(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
