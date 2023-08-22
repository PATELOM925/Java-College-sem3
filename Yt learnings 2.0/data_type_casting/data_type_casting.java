package data_type_casting;
import java.util.Scanner;

public class data_type_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//          float a = input.nextFloat();
//          System.out.println(a);
          // even if we input integer it will accept coz it type castes int to float

          // conditions for data types to cast each other automatically :
          // 1) the two types should be compatible
          // 2) the destination type should be greater than src data type (size)

//        int num = 'k';
//        System.out.println(num);


        // type casting when conditions aren't fullfillef(above 2)
//        int num  = 45.54f wrong method
//          int num = (int)(45.54f); // right method
//          System.out.println(num);

          // automatic type promotion in expressions
//          int a = 257; // byte can store max 256
//          byte b = (byte) (a);
//        System.out.println(b); // we get one bcoz..byte max storage=256..so it  257 % 256 & shows its value in byte

//        byte a = 20;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c ;  //here 20*50 exceeds byte range of 256 ,but still ans shows bcoz,java converts them to int
//        System.out.println(d);

//        byte b = 2;
//        b = b * 2; // error as we can't muliply int directly with byte without type casting.

        // rules of type casting
        // 1) all byte,char,short values are promoted to integer ,
        // if any one of them is long then whole promoted to LONG ,
        // if any one of them is float then promoted to FLOAT...
        // if its is double then to double..
//        System.out.println(5*3.333);

        byte a = 12;
        char b = 'c';
        short s = 212;
        int i = 12343;
        float f = 234.43f;
        double d = 0.112242;
        double result = (a*b) + (d - i) / (f-s);
        System.out.println(result);
        System.out.println( (a*b) + " " +(d - i) + " " + (f-s) );


//        // java is unicode
//        System.out.println("नमस्ते");
//        System.out.println("શુભેચ્છાઓ");
   }
}
