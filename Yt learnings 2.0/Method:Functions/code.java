import java.util.Scanner;

public class code {

public static void main(String[] args) {
            // Q) return String example
//            String greetings = greet();
//            System.out.println(greetings);


    Scanner in = new Scanner(System.in);
    System.out.println("enter your name");
    String naam = in.nextLine();
     String personalised = mygreet(naam);
    System.out.println(personalised);
    System.out.println(greet());
    
}

     static String mygreet(String name) {
    String message = "Hello " + name;
    return message;
    }

//static String greet(){
//    String mess = "Hello , Welcome to Java World";
//    return mess;
//}

    static String greet(){
    String greeting = "How are you?";
    return greeting;
    }

}