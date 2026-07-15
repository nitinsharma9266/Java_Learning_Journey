package For_loops;
import java.util.Scanner;
public class reverseofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        long n=sc.nextLong();
        long rev=0;
        for(;n!=0;n=n/10){
            long lastdigit=n%10;
            rev=rev*10+lastdigit;
        }
        System.out.println("reverse of a number "+rev);
        sc.close();
    }
}
