import java.util.ArrayList;
import java.util.Scanner;


public class MultiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Intialisation
        for (int i = 0; i<3; i++){  // 3 arraylist created inside arraylist
            list.add(new ArrayList<>());
        }

        //Add Elements
        for (int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                list.get(i).add(in.nextInt()); //get list at index i & add input through user(keyboard)
            }
        }
        System.out.println(list);


    }


}