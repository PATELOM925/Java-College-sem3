package conditional_loop;

import java.util.Scanner;

public class fibonacciNOS {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth term sum you want of fibonaaci seq: ");
        int n = in.nextInt();
        int count = 2;

        while (count <= n){
            int temp =  b;
            b = b + a;
            a = temp;
            count ++;
        }
        System.out.println(b);

    }
}
