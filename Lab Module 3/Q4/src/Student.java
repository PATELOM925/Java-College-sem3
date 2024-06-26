import java.io.*;
import java.util.*;

class Student {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        FileInputStream fin = new FileInputStream("Student.txt");
        System.out.println("File contents:");
        int ch;
        String s = "";
        ArrayList<String> arr = new ArrayList<String>();
        while((ch = fin.read()) != -1) {
            System.out.print((char)ch);
            if((char)ch == '\n') {
                arr.add(s);
                s = "";
            } else s = s + (char)ch;
        }
        fin.close();
        System.out.println("\nEnter which field you want to edit: ");
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
        String s_ = in.nextLine();
        System.out.println(s_);
        if(id_ >= 1 && id_ <= 3)
            arr.set(id_, s_);
        s = "";
        FileOutputStream f = new FileOutputStream("student.txt");
        for(int i = 0; i < arr.size(); i++) {
            s = s + arr.get(i) + '\n';
        }
        char[] ch_ = s.toCharArray();
        for(int i = 0; i < s.length(); i++)
            f.write(ch_[i]);

        f.close();

    }
}