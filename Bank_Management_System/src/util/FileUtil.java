package util;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static final String DATABASE_FOLDER = "database";
    public static final String ACCOUNT_FILE = DATABASE_FOLDER + "/account.txt";

    // Project start hone par call karna
    public static void initializeDatabase() {

        try {

            File folder = new File(DATABASE_FOLDER);

            if (!folder.exists()) {
                folder.mkdir();
                System.out.println("Database folder created.");
            }

            File file = new File(ACCOUNT_FILE);

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Account database created.");
            }

        } catch (IOException e) {
            System.out.println("Unable to initialize database.");
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