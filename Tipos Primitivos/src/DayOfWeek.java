import java.util.Scanner;

public class DayOfWeek {

    public static String determineNameOfDay(int dayNumber) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");

        dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 0 :
                return "Sunday";
            case 1 :
                return "Monday";
            case 2 :
                return "Tuesday";
            case 3 :
                return "Wednesday";
            case 4 :
                return "Thursday";
            case 5 :
                return "Friday";
            case 6 :
                return "Saturday";
            default :
                return "Invalid number";
        }

    }


}