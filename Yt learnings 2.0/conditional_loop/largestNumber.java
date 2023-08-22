package conditional_loop;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st no. :");
        int a = in.nextInt();
        System.out.println("Enter 2nd no. :");
        int b = in.nextInt();
        System.out.println("Enter 3rd no. :");
        int c = in.nextInt();


        // method 1
//
//        int max;
//        max = a ;
//
//        if (b>max){
//            max = b;
//        }
//        if (c>b){
//            max = c;
//        }


        // method 2

//        int max = 0;
//        if (a>b){
//            max = a;
//        }
//        else
//        { max = b;
//        }
//
//        if (b>c){
//            max = b;
//        }
//        else {
//            max =c;
//        }


        // METHOD 3

        int max = Math.max(c,Math.max(a,b));


        System.out.println(max);

        System.out.println(Math.max(234,345));




    }
}
