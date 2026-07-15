package Function;

import java.util.Scanner;

public class FactorialByRecursive {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();
        int factorial=fact(n);
        System.out.print("Factorial of a number : "+factorial);
        sc.close();
    }
}
