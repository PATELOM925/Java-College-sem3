package sum;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        float a = input.nextFloat();
        System.out.println("Enter 2nd integer");
        float b = input.nextFloat();
        float sum = a + b ;
        System.out.println("Your Sum =" + sum);
    }
}
