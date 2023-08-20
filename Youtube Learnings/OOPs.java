// by convention classes name is java starts with capital case
// by convention methods/function name is java starts with small case

class pen {
    String color; //red,blue,black
    String brand; // goldex,trimax
    String type; // ballpoint,gel,fountain



    public void write() {
        System.out.println("Pen is writing");  // + " " + color + " " + brand + " " + type);

    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void print() {

        System.out.println(this.name + " Age is:"  + this.age);
    }
    Student(String name, int age){
            this.name = name;
            this.age = age;
    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class OOPs {             // main class always declared in  public class
    public static void main(String[] args) {

        pen p1 = new pen();  // creating object in main class
        p1.brand = "Trimax";
        p1.type = "Gel";
        p1.color = "blue";
        p1.write();

        pen p2 = new pen();  // non parametrised constructor

        // new is keyword which creates memory in heap  // () comes behind functions only
        // so this type pen() are constructors.
        // constructors: have same name as class/methods , HAve no returtn type ,
        // also it's of 3 types non-parameterised , copy constructor & parameterised , Only one time it can be called :at time of declaring it.
        // java makes non-parameterized constructor itself , if we haven't made it
        // in java copy constructor is defined by user
        // in java destructor works automatically -- garbage collector,so we dont need to write them which makes it more efficient.


        p2.brand = "Goldex";
        p2.type = "Ball";
        p2.color = "Yellow";

        p2.printColor();
        p1.printColor();

        Student s1 = new Student("krishna",19);   // parameterised constructor
        Student s2 = new Student(s1);  // copy constructor

//        s1.name = "KRISHNA";
//        s2.name = "OM";      // this type used when non-parameterised constructor
//        s1.age = 19;
//        s2.age = 18;
        s1.print();
        s2.print();





    }
}