package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class DeleteAccountDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            BufferedReader br=new BufferedReader(new FileReader("bank.txt"));
            BufferedWriter wr=new BufferedWriter(new FileWriter("temp.txt"));

            System.out.println("Enter Account number to delete : ");
            String Account=sc.nextLine();

            boolean Found=false;
            String line;

            while((line=br.readLine())!=null){
                String[] parts=line.split(",");
                if(parts[0].equals(Account)){
                    Found=true;
                    continue;
                }
                
                wr.write(line);
                wr.newLine();
                
            }
            br.close();
            wr.close();

            File oldFile=new File("bank.txt");
            File tempFile=new File("temp.txt");

            if(oldFile.delete()){
                tempFile.renameTo(oldFile);
            }

            if (Found) {
                System.out.println("Account Deleted Successfully");
            }
            else{
                System.out.println("Account Not Found");
            }
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
