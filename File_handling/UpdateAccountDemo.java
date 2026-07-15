package File_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UpdateAccountDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        

        try{
            
            BufferedReader br=new BufferedReader(new FileReader("bank.txt"));
            StringBuilder data=new StringBuilder();

            System.out.print("Enter Account Number : ");
            String Account=sc.nextLine();
        
            System.out.println();
            System.out.println("Enter Deposite Balance : ");
            int Deposite=sc.nextInt();
            // int withdraw=sc.nextLine();

            String line;
            while((line=br.readLine())!=null){
                String parts[]=line.split(",");
                
                if(parts[0].equals(Account)){
                    int Balance=Integer.parseInt(parts[2]);

                    Balance=Balance+Deposite;

                    // withdraw logic Balance=Balance-withdraw;

                    line=parts[0]+","+parts[1]+","+Balance;

                    System.out.println("Updated record : "+line);
                
                }
                data.append(line).append("\n");

            }
            br.close();
            
            // Ab puri file dobara likhi gayi 

            BufferedWriter wr=new BufferedWriter(new FileWriter("bank.txt"));
            wr.write(data.toString());

            wr.close();

            System.out.println("Account updated Successfully");
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
        
    }

    
}
