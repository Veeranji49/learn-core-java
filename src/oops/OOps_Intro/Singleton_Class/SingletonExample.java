package oops.OOps_Intro.Singleton_Class;

public class SingletonExample {

    // Private static instance of the same class
    private static SingletonExample instance;

    // Private constructor to prevent instantiation from other classes
    private SingletonExample() {
        // Initialization code, if needed
    }

    // Public static method to provide the single instance of the class
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }

    // Method to demonstrate the singleton behavior
    public void showMessage() {
        System.out.println("Hello from Singleton class!");
    }

    public static void main(String[] args) {
        // Get the only instance of SingletonExample
        SingletonExample singleton = SingletonExample.getInstance();

        // Show a message using the singleton instance
        singleton.showMessage();
    }
}
