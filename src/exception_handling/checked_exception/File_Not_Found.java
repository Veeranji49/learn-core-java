package exception_handling.checked_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Not_Found {

    public static void main(String[] args) {
        File file = new File("nonexistentfile.txt");
        FileReader fr = null;

        try {
            fr = new FileReader(file);
            System.out.println("File opened successfully");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
            System.out.println("Finally block executed");
        }
    }
}
