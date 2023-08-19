import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {9,7,27,29};
        try {
            System.out.print("Enter index value: ");
            int i = in.nextInt();
            int p = array[i];
            try {
                System.out.print("Enter divisor: ");
                int q = in.nextInt();
                switch (q) {
                    case 0 -> throw new ArithmeticException();
                }
                System.out.println("Answer: " + (double)p/q);
            } catch(ArithmeticException e2) {
                System.out.println("divison by zero not possible");
            }
        } catch(ArrayIndexOutOfBoundsException e1) {
            System.out.println("index oit of bounds");
        }
    }
}