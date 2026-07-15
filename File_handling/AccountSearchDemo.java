package File_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AccountSearchDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Account number : ");
        String searchid=sc.nextLine();
        boolean found=false;

        try{
            BufferedReader br=new BufferedReader(new FileReader("Split.txt"));
            String line;
            while((line=br.readLine())!=null){
                String[] parts=line.split(",");
                if(parts[0].equals(searchid)){
                    System.out.println("Account Found");
                    found=true;
                    break;
                }
            }
            br.close();
            if(!found){
                System.out.println("Account Not Found");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        sc.close();


    }
}
