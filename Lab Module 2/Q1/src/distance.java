
import java.util.Scanner;

class distance {
    public void feet(double ft) {
        System.out.println("Thus distance in feet : " + ft);
    }

    public void inches(double in) {
        System.out.println("Thus distance in inches : " + in);
    }

    public static void main(String args[]) {
        distance d = new distance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in ft : ");
        int ft = sc.nextInt();
        d.feet(ft);
        System.out.println("Enter in inches : ");
        int in = sc.nextInt();
        d.inches(in);
    }
}

