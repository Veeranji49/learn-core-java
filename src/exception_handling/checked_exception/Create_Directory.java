package exception_handling.checked_exception;

import java.io.File;

public class Create_Directory {

    public static void main(String[] args) {

        try {
            File directory = new File("new_directory");
            if (directory.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create directory.");
            }
        } catch (SecurityException e) {
            System.out.println("Security Exception occurred: " + e.getMessage());
        }
    }
}
