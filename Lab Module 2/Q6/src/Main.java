
class Main {
    void length1(int a1) {
        System.out.println("simple method: " + a1);
    }
    static void length2(int a2) {
        System.out.println("static method: " + a2);
    }

    public static void main(String args[]) {
        Main m = new Main();
        m.length1(7);
        m.length2(5);
    } }