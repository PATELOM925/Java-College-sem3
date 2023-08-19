import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {7,9,25,29,2};
        System.out.print("Enter the element you want to find : ");
        int key = in.nextInt();
        int index = binarySearch(arr, key);
        System.out.println(index);
    }

    static int binarySearch(int[] arr, int key) {
        int lb = 0, ub = arr.length-1, mid;

        while(lb <= ub) {
            try {
                mid = (lb + ub) / 2;
                if(arr[mid] == key)
                    return mid;
                else if(arr[mid] > key)
                    ub = mid-1;
                else lb = mid+1;
                if(lb > ub) throw new ArrayIndexOutOfBoundsException();
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Element not found");
                System.exit(0);
            }
        }
        return -1;
    }

}