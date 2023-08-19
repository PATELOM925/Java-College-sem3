
// A)Passing by value

class Change {
    String name = "Om";


    void show(String name) {
        name = "Anshu"; }
    public static void main(String args[]) {
        Change in=new Change();
        System.out.println("Before : "+in.name); in.show("Anshu");
        System.out.println("After : "+in.name); }
} 