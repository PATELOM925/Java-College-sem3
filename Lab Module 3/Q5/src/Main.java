import java.io.*;
import java.util.*;

class Student {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        BufferedReader fin = new BufferedReader(new FileReader("Stud.txt"));
        System.out.println("File contents:");
        String s = "";
        ArrayList<String> arr = new ArrayList<String>();
        for(s = fin.readLine(); s != null; s=fin.readLine()) {
            System.out.println(s);
            arr.add(s);
        }
        fin.close();
        System.out.println("Enter which field you want to edit: ");
        System.out.print("1. Name\n2. Degree\n3. Group\n:");
        int id_ = -1, choice = in.nextInt();

        if(choice == 1) {
            System.out.print("Enter new name: ");
            id_ = 0;
        }
        if(choice == 2) {
            System.out.print("Enter new degree: ");
            id_ = 1;
        }
        if(choice  == 3) {
            System.out.print("Enter new Group: ");
            id_ = 2;
        }
        in.nextLine();
        String s_ = in.nextLine();
        System.out.println(s_);
        if(id_ >= 1 && id_ <= 3)
            arr.set(id_, s_);
        PrintWriter fout = new PrintWriter(new FileWriter("Edit_Stud.txt"));
        for(int i = 0; i < arr.size(); i++)
            fout.println(arr.get(i));
        fout.close();

    }
}