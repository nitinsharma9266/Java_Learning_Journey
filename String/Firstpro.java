package String;

import java.util.Scanner;

public class Firstpro {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Your First Name : ");
       String fname=sc.next();
       
       System.out.print("Enter Your last name : ");
       String lname=sc.next();
       String fullname=fname+" "+lname;
       System.out.println("Your Full Name is "+fullname);
       System.out.println("Lenth of your name is "+fullname.length());
        sc.close();
    }
}
