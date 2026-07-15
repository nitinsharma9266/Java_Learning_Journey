package Exception_Handling;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {

    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("abc.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}