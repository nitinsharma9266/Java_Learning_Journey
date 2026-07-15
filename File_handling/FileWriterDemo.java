package File_handling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("notes.txt",true);
            writer.write("Java\n");
            writer.write("Python\n");
            writer.write("C++\n");
            writer.write("JavaScript\n");
            writer.close();
            System.out.println("Data written successfully");
        }

        catch(IOException e){
            System.out.println("Error : "+e.getMessage());
            
        }
        
        
    }
    
}

