public class Bubble_Sort {

    public static void PrintArray(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 9, 8, 3};
        PrintArray(arr);

        //bubble sort  // pushing largest element at last(descending  Order) & swap pair wise while comparing them
        for (int i=0;i< arr.length-1;i++){    // here outer loop rooms for n-1
            for (int j=0; j< arr.length-1-i;j++){  // inner loops run for n-1,n-2,n-3......
                if(arr[j]<arr[j+1]){
                    //swap
                    int temp;                   // time complexity O(n^2) : O --> Big O Nototaion
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //O(n^2) isnt a good time complexity for sorting, its very
        PrintArray(arr);
    }
}