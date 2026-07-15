// This program uses BufferedWrite aur append mode.

package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) {
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("student.txt",true));
            bw.write("Python");
            bw.newLine();
            bw.write("Java");
            bw.newLine();
            bw.write("C++");
            bw.flush();
            bw.close();
        }
        catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
