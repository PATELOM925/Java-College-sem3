// it creates two part sorted and unsorted
// considers 1st elemt to be sorted
// compares 1st element one by one from unsorted part
// if its larger then pushes it one place back & adds that unsorted part elemnt in front
// now we have 2 elemnts in sorted and remaining in unsorted

//for ascending order(small---large)

public class Insertion_sort {

    public static void PrintArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] ascend = new int[]{9, 1, 5, 3, 7};



        //Insertion Sorting
        for(int i=1;i< ascend.length;i++){
            int current = ascend[i];
            int j = i-1;  // use to track sorted part
            while (j>=0 && current<ascend[j]){
                ascend[j+1]=ascend[j];
                j--;
            }
            //placement of array
            ascend[j+1] = current;

        }
        Insertion_sort.PrintArr(ascend);
    }


}
