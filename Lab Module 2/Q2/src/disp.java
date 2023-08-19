
import java.util.*;

class Distance
{
    int ft;
    int in;

    public Distance(int feet,int inches) {
        ft = feet; in = inches;
    }

    public Distance(Distance d) {
        ft = d.ft;
        in = d.in;
    }

    public Distance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter in ft first & then inches");
        ft = sc.nextInt();
        in = sc.nextInt();
    }

    public void Show() {
        System.out.println("Thus Distance is "+ft+" ft "+in+" in");
    }

    public void Add(Distance d3) {
        Distance temp = new Distance(ft,in);
        temp.ft = ft + d3.ft;
        temp.in = in + d3.in;

        if(temp.in>=12) {
            temp.ft++;
            temp.in-=12; }
        temp.Show(); }
}

public class disp{
    public static void main(String[] args) {
        Distance d1 = new Distance(5,10);
        d1.Show();
        Distance d2 = new Distance();
        d2.Add(d1); }
}


