package For_loops;
import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int original = n;

        // Step 1: Count digits
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        // Step 2: Calculate Armstrong sum
        int arm = 0;
        temp = n;
        while (temp > 0) {
            int rem = temp % 10;
            int power = 1;

            // rem^count calculate karne ke liye
            for (int i = 1; i <= count; i++) {
                power = power * rem;
            }
            arm = arm + power;
            temp = temp / 10;
        }
        // Step 3: Compare
        
        if (original == arm) {
            System.out.println("The number is Armstrong");
        } else {
            System.out.println("The number is Not Armstrong");
        }

        sc.close();
    }
}