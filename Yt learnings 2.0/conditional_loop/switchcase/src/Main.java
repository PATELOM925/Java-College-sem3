
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);

//        String a = "kunal";
//        String b = "kunal";
//        System.out.println( a == b);
        // .equals is used to only check value
        // == (boolean) may check both value and reference


//        System.out.println("Please enter a fruit");
//        String fruit = in.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("KING OF FRUITS");
//            case "orange" -> System.out.println("Color Fruit");
//            case "apple" -> System.out.println("Red Sweet Fruit");
//            case "grape" -> System.out.println("Tiny juicy Fruit");
//            case "banana" -> System.out.println("Calcium rich long Fruit");
//            case "avogadro" -> System.out.println("Fruit of Riches");
//            default -> System.out.println("Please Enter a Valid Fruit");
//        }
//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Sunday");
//                break;
//        }

        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");
            case 6, 7 -> System.out.println("Weekends");
        }






    }
}