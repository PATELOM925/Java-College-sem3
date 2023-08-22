import java.util.Arrays;

@SuppressWarnings("WrongPackageStatement")
public class Multidirection_arrays {
    public static void main(String[] args) {


    /*     1 2 3
          4 5 6
          7 8 9
    */

        /*
         1 D array
         int[] num = new int[];
         2D array
         syntax
         int[][] num = new int[][];
         multi direction/2d array is stored in HEAP memory as arrays of array.
                int[][] array2d = {
                        {1, 2, 3},  // 0th index
                        {4,5,6,7},   // 1st index
                        {8,9,10}    // 2nd index
                };
                System.out.println(array2d.length); //prints no. of rows
         input of arrays
                int[][] arr = new int[3][3];
                Scanner in = new Scanner(System.in);

                // for each column in row we want to get input
                for (int row  = 0; row< arr.length; row++)
                    for (int column = 0; column < arr[row].length; column++) {
                            arr[row][column] = in.nextInt();
                    }
         OUTPUT
                // 1
                for (int row  = 0; row< arr.length; row++) {
                    for (int column = 0; column < arr[row].length; column++) {
                        System.out.print(arr[row][column] + "");
                    }
                    System.out.println();
                }
                // 2
                      for (int row = 0; row< arr.length;row++){
                          System.out.println(Arrays.toString(arr[row]));
                      }

                //3 Enhanced For loop
                    for (int[] a : arr){
                        System.out.println(Arrays.toString(a));
                    }
         for string with enhanced for loop
        */

//        String[][] array = new String[][];
//        for (String[] example : array){
//            System.out.println(example);
//        }

        //output
        int[][] array2d = {
                {1, 2, 3},  // 0th index
                {4,5,6,7,},   // 1st index
                {8,9,10},    // 2nd index
                {},         //3rd Index
                {44,65,87,96,99} //4th index
        };

        System.out.println(Arrays.deepToString(array2d));

        System.out.println("With for loop");

        for (int row = 0; row<array2d.length; row++) {
            for (int column = 0; column < array2d[row].length; column++) {
                System.out.println( array2d[row][column] + "");
            }
            System.out.println();
        }



    }


}