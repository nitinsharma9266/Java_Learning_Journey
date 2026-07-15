package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class SplitDataDemo {
    public static void main(String[] args) {

        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("Split.txt",true));
            bw.write("101,Aman");
            bw.newLine();

            bw.write("102,Rahul");
            bw.newLine();

            bw.write("103,Nitin");
            bw.newLine();

            bw.close();

            System.out.println("Data Written Successfully");

            BufferedReader br=new BufferedReader(new FileReader("Split.txt"));
            String line;
            while((line=br.readLine())!=null){
                String [] parts=line.split(",");
                System.out.println("ID : "+parts[0]);
                System.out.println("Name : "+parts[1]);

                System.out.println("------------");
            }
            
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
