package For_loops;
import java.util.Scanner;
public class countsdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numberr  : ");
        long n=sc.nextLong();
        
        int count=0;
        for(; n!=0;n=n/10){
            
            count++;
            
        }
        System.out.println(count);
        sc.close();
    }
}
