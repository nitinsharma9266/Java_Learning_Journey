package File_handling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class UserDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name=sc.nextLine();

        System.out.println();
        System.out.print("Enter Age : ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println();
        System.out.print("Enter your city : ");
        String city=sc.nextLine();

        System.out.println();

        try{
            FileWriter writer=new FileWriter("Details.txt",true);
            writer.write(name+"\n"+age+"\n"+city+"\n");
            // writer.write(age);
            // writer.write(city);
            writer.close();

            System.out.println("Details saved succesfully");
        }
        catch(IOException e){
            System.out.println("Failed to save !"+e.getMessage());
        }
        sc.close();
    }
}
