package For_loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        
        int rev=0;
        int original=n;
        while(n>0){
            int lastdigit=n%10;
            rev=rev*10+lastdigit;
            n=n/10; 
        }
        if(original==rev){
            System.out.println("The number is Palindrome !");
        }
        else{
            System.out.println("The number is not Palindrome !");
        }
        sc.close();
    }
}
