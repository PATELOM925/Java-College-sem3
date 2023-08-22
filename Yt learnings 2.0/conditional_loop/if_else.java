package conditional_loop;

import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        //sysntax of if-else
        // if ( a boolean expression T or F) {
        // body
        // }
        // else {
        // do this
        // }

        // examples

        Scanner in = new Scanner(System.in);
        // example 1
//        System.out.println("Enter Your Monthly Income : ");
//        double amount = in.nextDouble();
//        if (amount>=41666.6666667){
//            System.out.println("You Have to pay tax");
//        }
//        else {
//            System.out.println("You don't have to pay tax");
//        }

        // Example 2 (multiple if-else )

        System.out.println("Enter Your Monthly salary : ");
        double salary = in.nextDouble();

        if (salary > 40000){
            salary += 4000; // salary = salary + 2000
        } else if (salary > 20000) {
            salary += 2000;
        } else if ( salary > 10000) {
            salary += 1000;
        } else {
            salary += 500;
        }

        System.out.println("Your total income now becomes " + salary);


        // for multiple conditions in if-else
        // we can use and : &&
        // if ( condition 1 && condition 2 ) {   ....   } ...if both condn true then it prints body ( works acc to its truth table)
        // we can use Or : ||
        // if ( condition 1 || condition 2 ) {   ....   } ... if any of condn true it prints body ( works acc to its truth table)
    }
}
