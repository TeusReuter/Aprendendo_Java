public class Main {
    public static void main(String[] args) {

//        Book b = new Book(1, "dufgjvisdgfh", "me");
//        b.addReview(new Review(10, "sdfsdffdfsd", 6));
//        System.out.println(b);

        Store s = new Store("My Store");
        s.addProduct(new Product("Pen", 1.00));

        System.out.println(s);
    }
}