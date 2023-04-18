public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("Name: %s, Price R$ %f", name, price);
    }
}
