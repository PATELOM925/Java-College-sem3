
class Main {
    Main(double ft, double in)
    {
        System.out.println("feet is : " + ft + "\n" + "inches is : " + in);
            System.out.println("Super class");
    }
}
class ABC extends Main { ABC() {
    super(50, 51);
    System.out.println("Sub class"); }
}
class super_class {
    public static void main(String args[]) {
        ABC in = new ABC();
    }
}
 
