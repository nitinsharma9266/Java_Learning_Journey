package Function;

import java.util.Scanner;

public class Recursiveprogram {
    public static void Print(int n){
        if(n==0){
            return;
        }
        Print(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the valu of n : ");
        int n=sc.nextInt();
        Print(n);
        sc.close();
    }
}
