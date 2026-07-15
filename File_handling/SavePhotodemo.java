package File_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SavePhotodemo {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("photo.jpg");

            FileOutputStream fos=new FileOutputStream("copy_photo.jpg");

            int data;

            while((data=fis.read())!=-1){
                fos.write(data);
            }
            fis.close();
            fos.close();

            System.out.println("Photo Copied Successfully.");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
