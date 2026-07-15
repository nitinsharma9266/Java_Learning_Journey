package Function;

import java.util.Scanner;

// With return Function.
public class FindSquare {
    public static int Square(int a){
        return a*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int result=Square(n);
        System.out.println("Square of the given number : "+result);
        sc.close();
    }
}
