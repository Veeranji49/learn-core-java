package oops.Abstraction;

public class Abstraction1 {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();

        // Start and stop the Car
        car.start();
        car.stop();
    }
}

// Abstract class representing a Vehicle
abstract class Vehicle {
    // Abstract method to start the vehicle
    abstract void start();

    // Concrete method to stop the vehicle
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Concrete subclass representing a Car
class Car extends Vehicle {
    // Implementing abstract method to start the Car
    @Override
    void start() {
        System.out.println("Car started");
    }
}