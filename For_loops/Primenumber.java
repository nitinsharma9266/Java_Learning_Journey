package For_loops;
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && n > 1) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is Not Prime");
        }
        sc.close();
    }
}