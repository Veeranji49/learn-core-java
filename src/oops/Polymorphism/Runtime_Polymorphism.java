package oops.Polymorphism;


// Parent class
class Vehicle {
    // Method to display a message
    void display() {
        System.out.println("This is a vehicle.");
    }
}

// Subclass 1
class Car extends Vehicle {
    // Override method to display a specific message for Car
    @Override
    void display() {
        System.out.println("This is a car.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    // Override method to display a specific message for Motorcycle
    @Override
    void display() {
        System.out.println("This is a motorcycle.");
    }
}

public class Runtime_Polymorphism{
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car(); // Reference of Vehicle and object of Car
        Vehicle vehicle2 = new Motorcycle(); // Reference of Vehicle and object of Motorcycle

        vehicle1.display(); // Output depends on actual object type (Car)
        vehicle2.display(); // Output depends on actual object type (Motorcycle)
    }
}
