import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student matheus = new Student("Matheus", 9, 7 ,8);
        System.out.println(matheus);

        ArrayListPratice item = new ArrayListPratice("Unknown", 1, 2, 3);
        System.out.println(item.print());
//        matheus.removeMarkAtIndex(0);
//        System.out.println(matheus.toString());

//        int numberOfMarks = matheus.getNumberOfMarks();
//        int sum = matheus.getTotalSumOfMarks();
//        int highest = matheus.getMaximumMark();
//        int lowest = matheus.getMinimumMark();
//        int lowestJava = matheus.getMinimumJavaWay();
//        BigDecimal average = matheus.getAverageMarks();
//        BigDecimal averageJava = matheus.getAverageMarksJavaWay();
//
//        System.out.println(numberOfMarks);
//        System.out.println(sum);
//        System.out.println(highest);
//        System.out.println(lowest);
//        System.out.println(lowestJava);
//        System.out.println(average);
//        System.out.println(averageJava);



        // add and remove with array list
//        ArrayList arrList = new ArrayList();
//        arrList.add("Whatever");
//        arrList.add("Don't Know");
//        arrList.add("Don't care");
//        System.out.println(arrList);
//
//        arrList.remove("Don't care");
//        System.out.println(arrList);
//
//        ArrayList<String> strArrayList = new ArrayList<String>();
//
//        strArrayList.add("Whatever");
//        strArrayList.add("idk");
//        System.out.println(strArrayList);
//        strArrayList.remove(1);
//        System.out.println(strArrayList);
//        //strArrayList.add(1);

    }
}