package conditional_loop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int ans = 0;

        // objective : To take input from user untill they don't press X or x .
        while (true) {
            System.out.println("Enter The operator: ");
            char op = in.next().trim().charAt(0);
            System.out.println();

            if ( op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // input 2 nos.
                System.out.println("Enter 1st number: ");
                int num1 = in.nextInt();
                System.out.println("Enter 2nd number: ");
                int num2 = in.nextInt();

                System.out.println();

                if ( op == '+'){
                    ans = num1 + num2 ;
                }
                if ( op == '-'){
                    ans = num1 - num2 ;
                }
                if ( op == '*'){
                    ans = num1 * num2 ;
                }
                if ( op == '/'){
                    if ( num2 != 0 ) {
                        ans = num1 / num2;
                    }
                }
                if ( op == '%'){
                    ans = num1 % num2 ;
                }
            } else if (  op == 'x' || op == 'X'){
                       break;
            } else {
                System.out.println("Invalid Operation !! ");
            }

            System.out.println("The Answer is: " + ans);
        }

    }
}
