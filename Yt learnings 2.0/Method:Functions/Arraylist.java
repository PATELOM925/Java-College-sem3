import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//java.util.* used to import all the classes of java

@SuppressWarnings("WrongPackageStatement")
public class Arraylist {
    public static void main(String[] args) {

        // to input any no. of elements in java & to let java handkle it we use ARRAYLIST
        // similar to vector in c++
        // arraylist is part of collection framework

        //syntax
        // ArrayList<data_typr> list = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(57);
//        list.add(37);list.add(457);list.add(0);
//
//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.contains(57));
//        System.out.println(list.set(4,99999));
//        System.out.println(list);
//        System.out.println(list.remove(0));
//        System.out.println(list);


        //input
        Scanner in = new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println("Enter" + i + "th index");
            list.add(in.nextInt());
        }
        System.out.println(list);

        // to get any element we can't use list[index] or like this
        // we have to use: list.get();

        // in reality arraylist have its size fixed
        // but when arraylist filled by some amount , it creates copy of the same array list of more than its previous size
        // then old elements copied in new list
        // old is then deleted


// arraylist functions
        //here name of arraylist is list
        //list.add(1/2/3)
        //lis.add(index,the no. we want)
        //list.get(index) -- to get the element a that index
        //list.set(ndex,no.) -- to replace/change number of any index
        //list.remove(index) -- to delete the index's element & shortens the list

        //Loops on lists
//        for(int i=0; i<list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();

        //Sorting the list   --  WILL SORT IN ASCENDING ORDER
//        list.add(0);
//        Collections.sort(list);  --- to use collection class--import java.util.Collections;
//        System.out.println(list);
//    }





}


}