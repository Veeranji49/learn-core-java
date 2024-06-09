package OOPs.Inheritance;

public class Hybrid_Inheritance {

    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat(); // Inherited from Animal
        dog.walk(); // Inherited from Dog

        Fish2 fish = new Fish2();
        fish.eat(); // Inherited from Animal
        fish.swim(); // Inherited from Fish
    }
}

// Interface for Walking behavior
interface Walkable2 {
    void walk();
}

// Interface for Swimming behavior
interface Swimmable2 {
    void swim();
}

// Parent class
class Animal2 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal and implementing Walkable interface
class Dog2 extends Animal2 implements Walkable2 {
    public void walk() {
        System.out.println("Dog is walking");
    }
}

// Child class inheriting from Animal and implementing Swimmable interface
class Fish2 extends Animal2 implements Swimmable2 {
    public void swim() {
        System.out.println("Fish is swimming");
    }
}
