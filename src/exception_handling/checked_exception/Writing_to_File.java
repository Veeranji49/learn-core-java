package exception_handling.checked_exception;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_to_File {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
            writer.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
