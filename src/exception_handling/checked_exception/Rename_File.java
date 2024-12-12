package exception_handling.checked_exception;

import java.io.File;

public class Rename_File {

    public static void main(String[] args) {

        try {
            File oldFile = new File("old_name.txt");
            File newFile = new File("new_name.txt");
            if (oldFile.renameTo(newFile)) {
                System.out.println("File renamed successfully.");
            } else {
                System.out.println("Failed to rename file.");
            }
        } catch (SecurityException e) {
            System.out.println("Security Exception occurred: " + e.getMessage());
        }
    }
}
