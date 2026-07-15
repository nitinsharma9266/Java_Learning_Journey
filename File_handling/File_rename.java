package File_handling;

import java.io.File;

public class File_rename {
    public static void main(String[] args) {
        File oldFile = new File("customer.txt");

        File newFile = new File("clients.txt");
        
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}