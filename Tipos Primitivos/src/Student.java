import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Student {

    public String name;

    public ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public ArrayList<Integer> getListOfMarks() {
        return listOfMarks;
    }

    public void setListOfMarks(ArrayList<Integer> listOfMarks) {
        this.listOfMarks = listOfMarks;
    }

    public Student(String name, int... listOfMarks) {
        this.name = name;
        for(int mark: listOfMarks)
            this.listOfMarks.add(mark);
    }


    public int getNumberOfMarks() {
//        return this.listOfMarks.length;
        return listOfMarks.size();
    }

    public int getTotalSumOfMarks() {
        int soma = 0;
        for(int mark: this.listOfMarks)
            soma += mark;
        return soma;
    }

    public int getMinimumJavaWay() {
        int lowest = Integer.MAX_VALUE;
        for(int i: this.listOfMarks)
            if(i < lowest)
                lowest = i;
        return lowest;
    }

    public BigDecimal getAverageMarksJavaWay() {
        int sum = getTotalSumOfMarks();
        int number = getNumberOfMarks();

        return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
    }

    public int getMaximumMarkArrList() {
        return Collections.max(listOfMarks);
    }

    public int getMinimumMarkArrList() {
        return Collections.min(listOfMarks);
    }

    public String toString() {
        return name + listOfMarks;
    }

    public void addMark(int mark) {
        listOfMarks.add(mark);
    }
    public void removeMarkAtIndex(int index) {
        listOfMarks.remove(index);
    }
}