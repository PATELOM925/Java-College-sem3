import java.util.Arrays;
import java.util.Scanner;

public class Max{
    public static void main(String[] args) {

        //Q2 find maximum from the array / range within array

        int[] arr= {1,3,23,18,43,65,1,0};
        System.out.println(Arrays.toString(arr));
//        System.out.println("Maximum value in Array is: "+ max(arr));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Start");
        int start = in.nextInt();
        System.out.println("Enter end");
        int end = in.nextInt();

        System.out.println("Maximum value in Array is: "+ max(arr,start,end));
    }

//     static int max(int[] arr) {
//     if (arr == null) return -1; OR if (arr.length == 0) return -1;
//        int maxVal = arr[0];
//        for (int i = 0;i<arr.length; i++){
//            if(maxVal<arr[i]){
//                maxVal = arr[i];
//            }
//        }
//        return maxVal;
//    }

        static int max(int[]arr,int start,int end) {

        // working on edge cases
            if (end>start) return-1;
            if (arr == null) return -1;


            int maxVal = arr[start];
            for (int i = 0; i <= end; i++) {
                if (maxVal < arr[i]) {
                    maxVal = arr[i];
                }
            }
            return maxVal;
        }





}