import java.util.ArrayList;

public class Items {

    public String name;
    public ArrayList<Integer> amount = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getAmount() {
        return amount;
    }

    public void setAmount(ArrayList<Integer> amount) {
        this.amount = amount;
    }

    public Items(String name, int... amount) {
        this.name = name;
        for(int item: amount)
            this.amount.add(item);
    }

    public String printItems() {
        return name + amount;
    }
}
