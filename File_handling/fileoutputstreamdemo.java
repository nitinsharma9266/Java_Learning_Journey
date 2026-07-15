package File_handling;

import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputstreamdemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fos=new FileOutputStream("Stream.txt");

            fos.write(65);
            fos.write(72);

            fos.close();
            System.out.println("Data Written Succesfully");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
