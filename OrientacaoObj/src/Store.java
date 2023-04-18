import java.util.ArrayList;

public class Store {

    private String name;
    private ArrayList<Product> products = new ArrayList<Product>();

    public Store(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public String toString() {
        return String.format("Loja: %s, produtos %s", name, products);
    }

}
