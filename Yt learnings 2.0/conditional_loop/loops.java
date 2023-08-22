package conditional_loop;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // loop is used to reduce duplicate coding repetively ..it loops the entire process in concise code

        /*
         for loop syntax:
         for (initialization ; condition ; increment/decrement ) {
              //body
            }
         */

        // Q) print no. from  1 to 7
//
//        for (int i=1 ; i<=7 ; i++ ){     // instead of  " i++ "  we can also write " i += 1 "
//            System.out.println(i);
//        }

//        // Q) print mno. from 1 to n
//        System.out.println("Enter n : ");
//        int n = in.nextInt();
//        for (int i =1 ;i<=n ; i += 1 ){
//            System.out.println(i + " ");



            // While loop syntax
        /*
        while (condition ) {
             //body
        }
         */

//        System.out.println("Enter n : ");
//        int n = in.nextInt();
//        int i=1 ;
//        while (i<=n) {
//            System.out.println(i);
//            i++;
//        }


        // use while loop : when you don't know no. of times loop gonna be run

        // USE FOR LOOP : When you KNOW no. of times LOOP GONNA BE RUN



        // do while Loop syntax

        /*
          do {

              } while ( condition) ;
         */

        System.out.println("Enter n : ");
        int n = in.nextInt();
        int i = 1 ;
        do {
            System.out.println(i);
            i++ ;
        } while ( i<=n);

         // in do while loop : loop executes  " atleast "  once
        // coz of " do " first it executes the body , then bcos of " while " it checks.

        // in while loop :  first it checks condition then executes

        }
    }
