//THEY ARE THE PROPERTIES ACCESIBLE TO ALL THE CLASS
//
//
//        Static Keyword
//        Static can be :
//        Variable (also known as a class variable)
//        Method (also known as a class method)
//        Block
//        Nested class
//
//
//STATIC VARIABLES,METHODS,... CAN BE ACCESSED BY CLASSNAME
//        eg----- class_name.variable/method/block

// all things in static are assigned memory once only
// but for object everytime new memory his created
// Thus common data is stored in static


class Employee{
        String name;
        static String Department;

        public static void Changedepartment(){
            Department = "Medical";
            System.out.println("New DEpartment is now: "+Department);
    }
}

public class Static {
    public static void main(String[] args) {
        // Employee.name // shows error as it is of object only
        Employee.Department = "IT"; //doesn't shows error as it is static
        Employee E1 = new Employee();
        E1.name = "Krishna";
        System.out.println("Department: " + E1.Department + "  " + E1.name);
        Employee.Changedepartment();
    }
}


