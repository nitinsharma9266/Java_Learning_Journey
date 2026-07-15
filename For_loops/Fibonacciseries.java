package For_loops;

import java.util.Scanner;

public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms to print fibanacci series : ");
        int n=sc.nextInt();
        int fib1=0;
        int fib2=1;
        System.out.print(fib1+" "+fib2);
        for(int i=1;i<n-1;i++){
            int next=fib1+fib2;
            System.out.print(" "+next);
            fib1 = fib2;
            fib2 = next;
        }
        sc.close();
    }
}
