package Function;
import java.util.Scanner;
public class CheckEO {
    public static void Even_Odd(int n){
        if(n%2==0){
            System.out.println("The Number is Even!");
        }
        else{
            System.out.println("The Number Is Odd!");
        }
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n=sc.nextInt();
            Even_Odd(n);
            sc.close();
        }
         
}

