class Program extends Thread {

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        }
        catch (Exception e)
        {System.out.println(" Thread Exception ");}
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            Program p1 = new Program();
            Program p2 = new Program();
//            p1.run();
            p1.start();
//            p2.run();
            p2.start();
        }
    }
}