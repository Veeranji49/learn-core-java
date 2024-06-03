package Exception_Handling.checked_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading_from_file {

    public static void main(String[] args) {

        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
