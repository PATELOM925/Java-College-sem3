//Interfaces
//        All the fields in interfaces are public, static and final by default.
//        All methods are public & abstract by default.
//        A class that implements an interface must implement all the methods declared in the interface.
//        Interfaces support the functionality of multiple inheritance.


interface Animals{
    void walk(); // by default public/abstract is given to methods of interfaces
}

interface Herbivore{
    void eats();
}
class Elephant implements Animals,Herbivore {   //multiple inheritance possible in java by INTERFACES ONLY
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
    public void eats(){
        System.out.println("Is herbivore");
    }
}

public class Interface {
    public static void main(String[] args) {
        Elephant E1 =new Elephant();
        E1.walk();


    }
}