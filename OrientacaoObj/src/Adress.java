public class Adress {
    private String line1;
    private String city;
    private String zip;

    // creation

    public Adress(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + " " + city + " " + zip;
    }
}
