package File_handling;

import java.io.File;

public class FolderCreation {
    public static void main(String[] args) {
        File folder=new File("BankManagement");
        folder.mkdirs();
        System.out.println("Folder Created");
        }
    }
