package File_handling;

import java.io.FileWriter;
import java.io.IOException;

public class BankDetails {
    public static void main(String[] args) {
        try{
            FileWriter writer=new FileWriter("bank.txt",true);
            writer.write(1001+",Nitin,"+5000+"\n");
            writer.write(1002+",Rahul,"+7000);
            
            writer.close();
            System.out.println("Data Written in the file");
        }
        catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
