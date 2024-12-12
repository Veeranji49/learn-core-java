package oops.Inheritance;

public class Multi_Level_Inheritance {

    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); // Inherited from Animal
        labrador.bark(); // Inherited from Dog
        labrador.color(); // Specific to Labrador
    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color");
    }
}