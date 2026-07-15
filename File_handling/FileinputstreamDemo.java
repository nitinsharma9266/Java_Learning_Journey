// FileInputStream is used to the byte Stream (byte files )like pdf,photo,video,mp3 etc.

package File_handling;

import java.io.FileInputStream;

public class FileinputstreamDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("demo.txt");
            int  data;
            while((data=fis.read())!=-1){
                System.out.print((char)data);
            }
            fis.close();
        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
