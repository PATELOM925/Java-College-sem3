import java.util.Scanner;

public class BitManipulation_SetBit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any integer between 0 to 15");
        int n = in.nextInt();
        System.out.println("Enter position which you want to get(btwn 0 to 3)");
        int position = in.nextInt();
        int Bitmask = n<<position;

            int NewNumber = Bitmask | n;
        System.out.println("The New Numer after SetBit is " + NewNumber);

    }

}