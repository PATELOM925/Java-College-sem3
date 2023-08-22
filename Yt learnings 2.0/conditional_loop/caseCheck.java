package conditional_loop;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        System.out.println( in.next() );  // prints the next line
//        System.out.println( in.next().trim() );   // trims the extra spaces & prints
//        System.out.println( in.next().trim().charAt(0) ); // prints the 1st character of the string & trims extra spaces

        System.out.println("Enter your Letter : ");
        char ch = in.next().trim().charAt(0);

            if ( ch >= 'a'  &&  ch <= 'z' ) {     //we learnt in type casting..ch can be type casted to int..so loop will work on values based of the characters
                System.out.println("Lower case");
            }
            else {
                System.out.println("Upper case");
            }

    }
}
