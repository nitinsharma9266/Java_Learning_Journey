package Function;

import java.util.Scanner;

public class Palindrome {
    public static void PLDRM(int n){
        int original=n;
        int rev=0;
        while (n>0) {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(original==rev){
            System.out.println("The number is Palindrome!");
        }
        else{
            System.out.println("The number is not palindrom!");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        PLDRM(n);
        sc.close();

    }
}
