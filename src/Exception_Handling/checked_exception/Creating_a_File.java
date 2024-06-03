package Exception_Handling.checked_exception;

import java.io.File;
import java.io.IOException;

public class Creating_a_File {

    public static void main(String[] args) {

        try {
            File file = new File("new_file.txt");
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
    }
}
