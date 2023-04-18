import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> student = List.of(new Student(1, "Matheus"),
                new Student(5, "Roberto"),
                new Student(3, "Carlos"));
        System.out.println(student);

        List<Student> studentArrList = new ArrayList<>(student);
//        Collections.sort(studentArrList);
//        System.out.println(studentArrList);

        Collections.sort(studentArrList, new AscStudentComparator());
        System.out.println(studentArrList);

//        studentArrList.sort(new DescendingStudentComparator());
//        System.out.println(studentArrList);

    }
}