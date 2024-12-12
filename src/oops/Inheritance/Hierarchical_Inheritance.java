package oops.Inheritance;

public class Hierarchical_Inheritance {

    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat(); // Inherited from Animal
        dog.bark(); // Specific to Dog

        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}

// Parent class
class Animal1 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class 1 inheriting from Animal
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child class 2 inheriting from Animal
class Cat extends Animal1 {
    void meow() {
        System.out.println("Cat is meowing");
    }
}