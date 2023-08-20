abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("Animal is created");
    }
    public void herbivore(){
        System.out.println("Animal is herbivore");
    }
    public void carnivore(){
        System.out.println("Animal is carnivore");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse is created");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Pigeon extends Animal {
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}


public class Abstraction {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
        horse1.herbivore();
        Pigeon pigeon1 = new Pigeon();
        pigeon1.walk();
        pigeon1.carnivore();

        // animal.walk(); // we cant create this object as Animal is abstract clas //here RUNTIME error will be faced
        // so animal is just a blueprint/imagination which has no real use

//        Abstract Class
//        An abstract class must be declared with an abstract keyword.
//        It can have abstract and non-abstract methods.
//        It cannot be instantiated.
//        It can have constructors and static methods also.
//        It can have final methods which will force the subclass not to change the body of the method.


    }
}