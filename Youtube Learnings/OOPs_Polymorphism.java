// poly = many, morphism = forms
// It;s of 2 types --
// 1) overloading (compile time polymorphism) (occurs when many same name functions have been created)
// 2) overriding  (run time polymorphism)\



//1)compile time polymorphism -- overloading
//c checks problems/exceptions at compile time, which makes easier for programmer to get to 100% perfection

class StudentID{
    String name;
    int age;

    public void print(String name) {
        System.out.println(name);
    }
    public void print(int age){
        System.out.println(age);
    }
    public void print(String name,int age){
        System.out.println(name + " " + age);
    }
// function over loading
    // rules of overloading
    // 1)one differentiating factor must be there
    // for eg: different return type --OR--  different datatype --OR-- different no.of arguments(datatypes)

}

public class OOPs_Polymorphism {
    public static void main(String[] args) {
        StudentID s1 = new StudentID( );   // parameterised constructor
        s1.name = "Krishna";
        s1.age = 19;

        s1.print(s1.age);
        s1.print(s1.name);
        s1.print(s1.name, s1.age);


    }
}

