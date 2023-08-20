// here we take smallest no. and push it at front
// here we dont swap
// we run a loop , compare it --- 1 swap per iteration/loop
// So uneccesary swaping doesn't occurs.
//ASCENDING ORDER

public class Selection_sort {

    public static void PrintArr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int ascend[] = {-4,3,25,5,9,5};

        //Selection sort
        //time complexity = O(n^2)
        //not optimum algorithm,very time consuming.
        for (int i=0;i<ascend.length-1;i++){
            int smallest = i;
            for (int j=i+1;j<ascend.length;j++){
                if(ascend[smallest]<ascend[j]){
                    //swap i
                    smallest = j;
                }
            }
            int temp = ascend[smallest];
            ascend[smallest] = ascend[i];
            ascend[i] = temp;


        }
        PrintArr(ascend);

    }



}
