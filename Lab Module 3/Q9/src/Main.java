import java.util.*;

class NegativeAge extends Exception {
    private String errorMessage;
    public NegativeAge(String error) {
        this.errorMessage = error;
    }
    public String toString() {
        return this.errorMessage;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = in.nextInt();
            if(age < 0)
                throw new NegativeAge("Age cant be negative");
        } catch(NegativeAge na) {System.out.println(na);}
    }
}