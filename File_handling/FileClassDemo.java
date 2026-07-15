package File_handling;
import java.io.File;
import java.io.IOException;


public class FileClassDemo {
    public static void main(String[] args) {
        // File file=new File("student.txt");
        File file=new File("bank.txt");
        
        try{
            
            
            if (file.createNewFile()) {
                System.out.println("File Created successfully");
            }
            else{
                System.out.println("File Already exists !");
            }
            System.out.println("File Exists : "+file.exists());
            System.out.println("File Name : "+file.getName());
            System.out.println("File Path : "+file.getPath());
            System.out.println("File Absolute Path : "+file.getAbsolutePath());
            System.out.println("File Length : "+file.length());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
        }
        
        catch(IOException e){
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        
        //System.out.println(file.delete());
    }
    
}
