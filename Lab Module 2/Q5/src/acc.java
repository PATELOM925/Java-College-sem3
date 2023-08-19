
class Distance {
    public int feet, inch;
    private int meters, centimeters;
    public final int kilo = 1000; Distance(int ft, int in) {
        meters = 1; centimeters =100;
        this.feet = ft;
        this.inch = in;
    }
    void Disp() {
        System.out.println("feet = " + feet); System.out.println("inches = " + inch); System.out.println("metres = " + meters);
        System.out.println("centimeters = " + centimeters); }

    void add(Distance d2) { d2.feet = d2.feet + kilo; d2.inch = d2.inch + kilo; }

    public class acc{
        public static void main(String args[]) {
            Distance d1 = new Distance(7, 5);
            Distance d2 = new Distance(70, 50);
            d1.Disp();
            d1.add(d2);
            d2.Disp(); }
    }
