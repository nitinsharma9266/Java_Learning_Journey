package Function;

import java.util.Scanner;

public class Adition {
    public static int ADD(int a,int b){
        return a+b;
    }
    // public static int ADD(int a, int b, int c){
    //     return a+b+c;
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        // System.out.println("Enter the value of c : ");
        // int c=sc.nextInt();

        int result=ADD(a, b);
        System.out.println("Result of sum : "+result);
        sc.close();
    }
}
