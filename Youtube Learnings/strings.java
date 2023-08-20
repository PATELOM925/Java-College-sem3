import java.util.*;

public class strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // concatenation of string
        String firstName = "OM";
        String lastName = "PATEL";
        String fullName = firstName + " " + lastName;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fullName);

        // string_name.length();
        // string_name.charAt(); --- to get access/print character of the index in string we want
        // string_name1.compareTo(); -- compares 2 string , returns 0 if equal , returns +ve if name1>name2 , returns -ve if name1<name2
        // == fails sometimes in strings
        // string_name.substring(start index,end index); --- prints a part of string from start index to (end index-1)
        // String is IMMUTABLE (changes impossible in that same string)
        // StringBuilder is mutable (changes possible in that same stringbuilder)
        // StringBuilder name = new StringBuilder
        // name.charAt();
        // name.insert(index,'character'); -- will insert character at the index we want to , and further string index will increase.
        // name.set(index,'character'); -- will replace the original char at index  with our character
        // name.delete(index); -- deletes any char from any index--thus decreasing strings index length
        // name.append("a") -- adds a at end of stringBuilder.
        // name.length() -- gives length of string

    }
}
