import java.util.*;

class InsufficientFunds extends Exception {
    private String msg;
    public InsufficientFunds(String s) {
        this.msg = s;
    }
    public String toString() {
        return this.msg;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your balance: ");
        float amt, balance = in.nextFloat();

        try {
            while(true) {
                System.out.print("Enter withdrawal amount: ");
                amt = in.nextFloat();
                if(amt > balance)
                    throw new InsufficientFunds("Not sufficient funds");
                balance -= amt;
                System.out.println("Updated balance: " + balance);
            }
        } catch(InsufficientFunds ex) {System.out.println(ex);}
    }
}