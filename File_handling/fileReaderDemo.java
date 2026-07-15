package File_handling;
import java.io.FileReader;


public class fileReaderDemo {
    public static void main(String[] args) {
        try{
            FileReader reader=new FileReader("abc.txt");
            int ch;
            int count=0;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
                if(ch!=' '){
                    count++;
                }  
            }
            System.out.println();
            System.out.print(count);
            reader.close();
        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
