import org.w3c.dom.css.CSSMediaRule;

import java.util.Scanner;

class swap {

public static void main(String[] args) {

     Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = in.nextInt();
        int b = in.nextInt();

      method(a,b);
   System.out.println( "a : "+a+"\nb : " + b);
  }

  static void method (int a, int b){
    int temp = a;
    a = b;
    b = temp;
  }

  // no swapping as primitive data
  // does pass by value

  // in strings
  // they are immutable / can't be changed/swap

  // non-primitve(arrays.....) or objects
  // does pss by value of reference
  // swap occurs

}