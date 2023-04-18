public class Customer {

    // state of the object
    private String name;
    private Adress homeAdress;
    private Adress workAdress;

    // creating
    public Customer(String name, Adress homeAdress) {
        this.name = name;
        this.homeAdress = homeAdress;
    }

    // operations

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(Adress homeAdress) {
        this.homeAdress = homeAdress;
    }

    public Adress getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(Adress workAdress) {
        this.workAdress = workAdress;
    }

    public String toString() {
        return String.format("name - [%s] home adress - [%s] work adress [%s]", name, homeAdress, workAdress);
    }
}
