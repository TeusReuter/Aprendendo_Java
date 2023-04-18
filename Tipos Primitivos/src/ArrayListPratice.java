import java.util.ArrayList;

public class ArrayListPratice {

    public String name;
    public ArrayList<Integer> values = new ArrayList<Integer>();

    public ArrayListPratice(String name, int... values) {
        this.name = name;
        for(int value: values)
            this.values.add(value);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getValues() {
        return values;
    }

    public void setValues(ArrayList<Integer> values) {
        this.values = values;
    }

    public String print() {
        return name + values;
    }
}
