import org.w3c.dom.css.CSSMediaRule;

import java.util.Arrays;
import java.util.Scanner;

class swap_Array{

    //Q1 Swap indexex in array

public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
       int arr[]= {1, 3,23, 9, 18};
    System.out.println("Original: "+ Arrays.toString(arr));
       swap(arr,0,4);
    System.out.println("After Swap: "+ Arrays.toString(arr));

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