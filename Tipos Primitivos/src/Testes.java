import java.time.LocalDate;
import java.util.Scanner;

public class Testes {


    //        Person[] persons = new Person[5];
//        persons[1] = new Person();
//        System.out.println(persons);
//
//        Person[] person2 = {new Person(), new Person()};
//        System.out.println(person2);
//
//        // string não precisa dar o new
//        String[] text = {"Apple", "Ball"};
//        System.out.println(text);

//        String strArr[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//        System.out.println(Arrays.toString(strArr));
//
//        Student student = new Student("Matheus", new int[] {9, 5, 7});
//        student.getMinimumJavaWay();

//    String daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//    String mostCharacters = "";
//        for(String day: daysOfWeek)
//            if(day.length() > mostCharacters.length())
//    mostCharacters = day;
//        System.out.println(mostCharacters);
//
//        for(int i = 0; i < daysOfWeek.length; i++) {
//        System.out.println(daysOfWeek[i]);
//    }
//
//        System.out.println();
//
//        for(int i = daysOfWeek.length - 1; i > 0; i--) {
//        System.out.println(daysOfWeek[i]);
//    }



    //        int[] listOfMarks = {10, 9, 8};
//        Student matheus = new Student("Matheus", listOfMarks);
//        Student matheus = new Student("Matheus", new int[] {10, 9, 8});
//        Student firstOne = new Student("First", 10,9);
//        Student secondOne = new Student("Second", 10,9,8);
//
//        int number1 = firstOne.getNumberOfMarks();
//        int number2 = secondOne.getNumberOfMarks();
//
//        System.out.println(number1);
//        System.out.println(number2);





//    Args methods = new Args();
//            methods.print(1, 2, 3);
//            System.out.println(methods.sum(2,2,3));


    //        int[] listOfMarks = {10, 9, 7, 5};
//        Student matheus = new Student("Matheus", listOfMarks);
//
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




    //        System.out.println(matheus.numOfMarks());
//        for(int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }

    // printar o array
//        System.out.println(Arrays.toString(marks));

    // for que dá pra usar em arrays e listas
//        for(int mark:marks)
//            System.out.println(mark);

    // preencher o array com valores
//        int[] newArray = new int[5];
//        System.out.println(Arrays.toString(newArray));
//        Arrays.fill(newArray, 100);
//        System.out.println(Arrays.toString(newArray));

    //comparar valores de arrays
//        int[] arr1 = {1, 2, 3};
//        int[] arr2 = {1, 2, 3};
//        System.out.println(Arrays.equals(arr1, arr2));

    // como ordenar os valores de um array
//        int[] arr3 = {2, 1, 3};
//        Arrays.sort(arr3);
//        System.out.println(Arrays.toString(arr3));






//    int[] marks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println(Arrays.toString(marks));
//
//        // for diferente
//        for(int mark:marks) {
//            System.out.println(mark);
//        }
//
//        int[] marks2 = new int[5];
//        Arrays.fill(marks2, 100);
//
//        for(int mark:marks2)
//            System.out.println(mark);
//
//        int[] arr = {1, 2, 3};
//        int[] arr2 = {1, 2, 3};
//
//        System.out.println(Arrays.equals(arr, arr2));


    //
//    int[] marks = {1, 2, 3};
//
//    int[] marks1 = new int[5];
//    marks1[0] = 1;
//    marks1[1] = 2;
//    marks1[2] = 3;
//    marks1[3] = 4;
//    marks1[4] = 5;
//    ;
//    System.out.println(marks1[3]);
//
//    for (int i = 0; i < marks1.length; i++) {
//        System.out.println(marks1[i]);
//    }



//    LocalDate today = LocalDate.now();
//        System.out.println(today);
//
//    LocalDate yesterday = LocalDate.of(2023,04,05);
//        System.out.println(yesterday);
//
//        System.out.println(today.withYear(1998));
//        System.out.println(today.withDayOfYear(360));



//    String i = "5";
//    int i1 = Integer.valueOf(i);
//        System.out.println(i);
//        System.out.println(i1);
//    float i2 = Float.valueOf(i);
//        System.out.println(i2);


    //        String str = "in28minutes";
//        str.concat("awesome");
////        System.out.println(str.concat("awesome"));
////        System.out.println(str + "Awesome");
////        System.out.println(str + "Awesome");



    //String str = "This is a lot of text";
//
////        for(int i = 0; i < str.length(); i++) {
////            System.out.println(str.charAt(i));
////        }
//
//        if(str.contains("lot")) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }



//    Scanner scanner = new Scanner(System.in);
//    int number = 0;
//
//        do {
//        System.out.print("Enter a number: ");
//        number = scanner.nextInt();
//        System.out.print(number * number * number + "\n");
//    }while(number > 0);

//    WhileNumberPlayer player = new WhileNumberPlayer(10);
//
//        player.printSquaresUpToLimit();
//        player.printCubesUpToLimit();


    //        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j <= i; j++) {
//                System.out.print(j + " " );
//            }
//                System.out.println();
//        }



//    public static void main(String[] args) {
//
////        boolean ternario = (1+1==3 ? true : false);
////        System.out.print(ternario);
//
//        String ternario = (1+1==2 ? "S" : "N");
//        System.out.print(ternario);
//
////        DayOfWeek dayOfWeek = new DayOfWeek();
////        System.out.println(dayOfWeek.determineNameOfDay(5));
//
//    }

//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number 1: ");
//        int number1 = scanner.nextInt();
//
//        System.out.print("Enter number 2: ");
//        int number2 = scanner.nextInt();
//
//        System.out.println("Operations available are: ");
//        System.out.println("1 - Add ");
//        System.out.println("2 - Subtract");
//        System.out.println("3 - Divide");
//        System.out.println("4 - Multiply");
//
//        System.out.print("Enter choice: ");
//        int operation = scanner.nextInt();
//
//        System.out.println("Your choices are");
//        System.out.println("Number 1 " + number1);
//        System.out.println("Number 2 " + number2);
//        System.out.println("Operation " + operation);
//
//        int result = 0;
//
//        // nested ifs
//
////        if(operation == 1) {
////            result = number1 + number2;
////        } else if(operation == 2) {
////            result = number1 - number2;
////        } else if (operation == 3) {
////            result = number1 / number2;
////        } else if (operation == 4) {
////            result = number1 * number2;
////        } else {
////            System.out.println("Invalid entry!");
////        }
//
//        // switch case
//
//        switch(operation) {
//
//            case 1: System.out.println("Result is " + (number1 + number2));
//            break;
//
//            case 2 : System.out.println("Result is " + (number1 - number2));
//            break;
//
//            case 3 : System.out.println("Result is " + (number1 / number2));
//            break;
//
//            case 4 : System.out.println("Result is " + (number1 * number2));
//            break;
//
//            default : System.out.println("Invalid operation!");
//        }
//    }


//public class Main {
//    public static void main(String[] args) {
//
//        CharMethods caracter = new CharMethods('A');
////        System.out.println(caracter.ehVogal());
////        System.out.println(caracter.ehDigito());
////        System.out.println(caracter.ehLetra());
////        System.out.println(caracter.ehConsoante());
//        System.out.println(caracter.lowerCase());
//    }
//}


//    JurosSimples jurosSimples = new JurosSimples("4500.00", "7.5");
//    BigDecimal valorTotal = jurosSimples.calculaJuroSimples(5);
//    System.out.println(valorTotal);


//   public static void main(String[] args) {
//
//       BigDecimalCalculator bg = new BigDecimalCalculator("8", "0");
//       bg.
//
////        BigDecimalCalculator bg = new BigDecimalCalculator("22.22", "44.44");
////        System.out.println(bg.sumOperation());
////
////        BigDecimalCalculator bg = new BigDecimalCalculator("8", "4");
////        System.out.println(bg.subtraction());
////
////
////        BigDecimalCalculator bg = new BigDecimalCalculator("2", "4");
////        System.out.println(bg.multiplication());
////
////        BigDecimalCalculator bg = new BigDecimalCalculator("8", "4");
////        System.out.println(bg.division());
//    }
//
//}
//
//


    //

    // public static void main(String[] args) {

//        int i = 100000;
//        long l = 5000000000000l;
//        // explícita é pra quando o cast é pra um tipo com menor valor, ex:
//        //i = (int) l;
//        //System.out.println(i);
//
//        // implícita é quando é de um  tipo menor pra maior, ex:
//        l = i;
//        System.out.println(l);

////////////////////////////*********************///////////////////////////////////////////////////

//        BiNumber numbers = new BiNumber(3, 2);
//        System.out.println(numbers.add());
//        System.out.println(numbers.multiply());
//        numbers.doubleValue();
//        System.out.println(numbers.getNum1());
//        System.out.println(numbers.getNum2());

////////////////////////////*********************///////////////////////////////////////////////////

    // usa se bigdecimal para ponto flutuante que será usado em calculos
    // após criada, uma variável bigdecimal não poderá ter seu valor mudado, somente criando novas variáveis a partir dela
    // sempre passar string para o constructor do BigDecimal
//        BigDecimal num1 = new BigDecimal("34.548894");
//        System.out.println(num1);
//
//        BigDecimal num2 = new BigDecimal("34.2234");
//        System.out.println(num1.add(num2));
//
//        BigDecimal num3 = num1.add(num2);
//        System.out.println(num3);

//        BigDecimal num1 = new BigDecimal("22.22");
//        BigDecimal num2 = new BigDecimal("44.44");
//        BigDecimal num3 = num1.add(num2);
//
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//
//        // usando bigdecimal com int
//        int i = 5;
//        BigDecimal num4 = new BigDecimal(i);
//
//        // exemplo de divisao com bigdecimal utilizando int
//        BigDecimal num5 = new BigDecimal("11.5");
//        System.out.println(num5.divide(new BigDecimal(100)));



}
