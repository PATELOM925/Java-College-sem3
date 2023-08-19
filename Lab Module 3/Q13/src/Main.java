import java.util.Scanner;

class Program implements Runnable {

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch(Exception e)
        {System.out.println(" Thread Exception ");}
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. uptill threading you desire");
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {

            Program p1 = new Program();
            Thread t1 = new Thread(p1);
            t1.start();
//            t1.run();

        }
    }

}