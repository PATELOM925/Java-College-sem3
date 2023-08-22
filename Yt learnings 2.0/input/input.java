package input;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

//        System.out.println("Please enter any integer : ");
//           int rollno = input.nextInt();                       // for int output
//        System.out.println("your integer is " + rollno);

//         int a = 234_000_000;       // to print in millions,billions,thousands
//         System.out.println(a);    //(x,00,00..) represented by '_' instead of ',' i.e (x_00_00)

//                String name = input.nextLine();    // for string output //nextline prints whole sentence bbelow
//                System.out.println(name);        // next prints only 1st word of whole sentence written

          float marks = input.nextFloat();
        System.out.println(marks);

        boolean marks2 = input.hasNextFloat(); // hasNext checks whether the given data type is there or not , acc prints yes or no
        System.out.println(marks2);

        double marks_double = input.nextDouble();
        System.out.println(marks_double);

    }
}
