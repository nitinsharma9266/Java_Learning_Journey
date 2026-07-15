package For_loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the value of N : ");
        int n=sc.nextInt();
        int Fact=1;
        for(int i=1;i<n+1;i++){
            Fact=Fact*i;
        }
        System.out.println("Factorial of N "+Fact);
        sc.close();
    }
}
