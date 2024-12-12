package oops.Abstraction;

public class Abstraction2 {

    public static void main(String[] args) {
        // Create an AndroidPhone object
        AndroidPhone androidPhone = new AndroidPhone();

        // Make a call using AndroidPhone
        androidPhone.makeCall("1234567890");

        // Send a text message using AndroidPhone
        androidPhone.sendText("1234567890", "Hello, this is an Android message");

        System.out.println(); // Adding a line break for clarity

        // Create an iPhone object
        iPhone iPhone = new iPhone();

        // Make a call using iPhone
        iPhone.makeCall("9876543210");

        // Send a text message using iPhone
        iPhone.sendText("9876543210", "Hello, this is an iMessage");
    }
}

// Abstract class representing a Mobile Phone
abstract class MobilePhone {
    // Abstract method to make a call
    abstract void makeCall(String number);

    // Concrete method to send a text message
    void sendText(String number, String message) {
        System.out.println("Sending text message to " + number + ": " + message);
    }
}

// Concrete subclass representing an Android Phone
class AndroidPhone extends MobilePhone {
    // Implementing abstract method to make a call
    @Override
    void makeCall(String number) {
        System.out.println("Making call to " + number + " using Android Phone");
    }
}

// Concrete subclass representing an iPhone
class iPhone extends MobilePhone {
    // Implementing abstract method to make a call
    @Override
    void makeCall(String number) {
        System.out.println("Making call to " + number + " using iPhone");
    }

    // Overriding sendText method to provide iPhone-specific implementation
    @Override
    void sendText(String number, String message) {
        System.out.println("Sending iMessage to " + number + ": " + message);
    }
}