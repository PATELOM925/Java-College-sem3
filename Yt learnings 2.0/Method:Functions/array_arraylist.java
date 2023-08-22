import java.util.Arrays;

@SuppressWarnings("WrongPackageStatement")
public class array_arraylist {
    public static void main(String[] args) {
        // in java there's only call by value
        // passing in functions/Method
        int nums[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("before:");
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println("After:");
        System.out.println(Arrays.toString(nums));

        //strings are immutable in java
        // Arraya are mutable in java

    }

    static void change(int[] arr){
        arr[0]=0;
    }

}