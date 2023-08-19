//B)Passing by reference

class Change {
    String name = " Om";
    void show() {
        name = "Anshu";
    }
    public static void main(String args[]) {
        Change in = new Change();
        System.out.println("Before  : " + in.name);
        in.show();
        System.out.println("After : " + in.name); }
} 