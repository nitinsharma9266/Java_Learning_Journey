/*
import java.util.Scanner;
public class ExceptionExample{
    public static void main(String args[]){
        int[] arr={21,5,67,8,9,90,34};
        int idx,a,ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index :");
        idx=sc.nextInt();
        System.out.println("Enter number to divide :");
        a=sc.nextInt();
        ans=arr[idx]/a;
        System.out.println("Ans = "+ans);
    }
}
*/
import java.util.Scanner;

public class ExceptionExample{
    public static void main(String[] args){
        int[] arr={21,5,67,8,9,90,34};
        int idx,a,ans=0;
        Scanner sc=new Scanner(System.in);

        try{
            idx=sc.nextInt();
            a=sc.nextInt();

            ans=arr[idx]/a;
            System.out.println("Ans = "+ans);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
        catch(Exception e){
            System.out.println("Some error occurred!");
        }
        sc.close();
    }
}