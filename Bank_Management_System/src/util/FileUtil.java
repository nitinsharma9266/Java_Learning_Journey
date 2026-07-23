package util;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static final String PROJECT_ROOT = System.getProperty("user.dir");

    public static final String DATABASE_FOLDER =
            PROJECT_ROOT + File.separator + "database";

    public static final String ACCOUNT_FILE =
            DATABASE_FOLDER + File.separator + "account.txt";
    
            
    // Constructor private banaya gaya hai
    private FileUtil() {
        // Prevent instantiation
    }

    // Project start hone par call karna
    public static void initializeDatabase() {

        try {

            File folder = new File(DATABASE_FOLDER);

            if (!folder.exists()) {
                if (folder.mkdirs()) {
                    System.out.println("Database directory created successfully.");
                } else {
                    System.out.println("Failed to create database directory.");
                }
            }

            File file = new File(ACCOUNT_FILE);

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Account database initialized successfully.");
            }

        } catch (IOException e) {
            System.out.println("Unable to initialize database.");
            e.printStackTrace();
        }

    }

    // File path return karega
    public static String getAccountFilePath() {
        return ACCOUNT_FILE;
    }

    // File exist karti hai ya nahi
    public static boolean fileExists() {
        return new File(ACCOUNT_FILE).exists();
    }

}