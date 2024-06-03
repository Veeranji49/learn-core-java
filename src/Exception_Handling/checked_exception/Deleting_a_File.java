package Exception_Handling.checked_exception;

import java.io.File;

public class Deleting_a_File {

    public static void main(String[] args) {

        try {
            File file = new File("file_to_delete.txt");
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete file.");
            }
        } catch (SecurityException e) {
            System.out.println("Security Exception occurred: " + e.getMessage());
        }
    }
}
