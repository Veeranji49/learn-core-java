package OOPs.OOps_Intro.Final_Keyword;

public class FinalKeywordExample {

    // Final variable
    final int constantValue = 10;

    // Final method
    public final void displayConstant() {
        System.out.println("Constant Value: " + constantValue);
    }

    public static void main(String[] args) {
        // Create an instance of the class
        FinalKeywordExample example = new FinalKeywordExample();

        // Display the final variable
        example.displayConstant();

        // Trying to change the final variable (will cause an error if uncommented)
        // example.constantValue = 20; // Uncommenting this line will cause a compile-time error

        // Final class example
        FinalClass finalClass = new FinalClass();
        finalClass.showMessage();
    }
}

// Final class
final class FinalClass {
    public void showMessage() {
        System.out.println("This is a final class.");
    }
}

// Attempting to extend a final class (will cause an error if uncommented)
// class SubClass extends FinalClass { // Uncommenting this line will cause a compile-time error
// }

