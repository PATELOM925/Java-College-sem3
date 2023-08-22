import org.w3c.dom.css.CSSMediaRule;

import java.util.Arrays;
import java.util.Scanner;

class Reversing_Array{

    //Q3 Reverse an Array

public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
       int arr[]= {1, 3,23, 9, 18,25};
    System.out.println("Before reverse: "+ Arrays.toString(arr));
    reverse(arr);
    System.out.println("After reverse: "+ Arrays.toString(arr));

  }

  static void reverse(int[] arr){
    int start = 0;
    int end = arr.length - 1;
    while (start<end) {
        //swap
        swap(arr,start,end);
        start++;
        end--;
    }
  }

  static void swap (int[]arr, int index1,int index2){
    int temp = arr[index1];
    arr[index1] = arr[index2];
    arr[index2] = temp;
  }


  // non-primitve(arrays.....) or objects
  // does pss by value of reference
  // swap occurs

}