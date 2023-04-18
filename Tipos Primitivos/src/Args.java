import java.util.Arrays;

public class Args {

    public void print(int... values) {
        System.out.println(Arrays.toString(values));
    }

    public int sum(int... values) {
        int sum = 0;

        for (int value: values)
            sum += value;

        return sum;
    }
}
