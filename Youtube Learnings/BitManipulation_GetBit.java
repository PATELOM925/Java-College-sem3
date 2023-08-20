import java.util.Scanner;

public class BitManipulation_GetBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any integer between 0 to 15");
        int n = in.nextInt();
        System.out.println("Enter position which you want to get(btwn 0 to 3)");
        int position = in.nextInt();
        int Bitmask = n<<position;

        if((Bitmask & n)==0){
            System.out.println("Bit we get is 0");
        }
        else {
            System.out.println("Bit we get is 1");
        }

    }
}