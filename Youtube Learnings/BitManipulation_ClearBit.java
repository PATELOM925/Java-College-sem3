import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class BitManipulation_ClearBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any integer between 0 to 15");
        int n = in.nextInt();
        System.out.println("Enter position which you want to get(btwn 0 to 3)");
        int position = in.nextInt();
        System.out.println("Enter 0 or 1 to update");
        int update = in.nextInt();

        int Bitmask = 1<<position;

        if(update == 1){
            //setBit
            int or = Bitmask | n;
            System.out.println(or);
        }
        else {
            //clearBit0
            int not = ~Bitmask;
            int and = not & n;
            System.out.println(and);
        }


    }
}