package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) {
        try{
            BufferedReader br=new BufferedReader(new FileReader("notes.txt"));
            String line=br.readLine();
            // while((line=br.readLine())!=null)  This line prints the all lines what that will be present in the file .
             System.out.println(line);
            br.close();
        }
        catch(IOException e){
            System.out.println("File doesn't exist "+e.getMessage());
        }

    }
}
