package oops.Inheritance;

public class Multiple_Inheritance {

    public static void main(String[] args) {
        Human human = new Human();
        human.walk(); // Inherited from Walkable
        human.swim(); // Inherited from Swimmable
    }
}

// Interface 1
interface Walkable {
    void walk();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implementing both interfaces
class Human implements Walkable, Swimmable {
    public void walk() {
        System.out.println("Human is walking");
    }

    public void swim() {
        System.out.println("Human is swimming");
    }
}

