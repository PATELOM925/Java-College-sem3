public class Priority extends Thread{
    public void run() {
        System.out.println("Inside the run method.");
    }

    public static void main(String[] args) {
        Priority p1 = new Priority();
        Priority p2 = new Priority();
        Priority p3 = new Priority();
        Priority p4 = new Priority();
        Priority p5 = new Priority();

        System.out.println("Default priority of Threads");
        System.out.println("p1 thread priority: " + p1.getPriority());
        System.out.println("p2 thread priority: " + p2.getPriority());
        System.out.println("p3 thread priority: " + p3.getPriority());
        System.out.println("p4 thread priority: " + p4.getPriority());
        System.out.println("p5 thread priority: " + p5.getPriority());

        p1.setPriority(MAX_PRIORITY);
        p2.setPriority(7);
        p3.setPriority(3);
        p4.setPriority(5);
        p5.setPriority(MIN_PRIORITY);

        System.out.println("");
        System.out.println("Priority of Threads after Set");
        System.out.println("p1 thread priority: " + p1.getPriority());
        System.out.println("p2 thread priority: " + p2.getPriority());
        System.out.println("p3 thread priority: " + p3.getPriority());
        System.out.println("p4 thread priority: " + p4.getPriority());
        System.out.println("p5 thread priority: " + p5.getPriority());

        Thread.currentThread().setPriority(MAX_PRIORITY);
        System.out.println("Top Most Priority: " + Thread.currentThread().getPriority());
    }
}