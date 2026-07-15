package For_loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Negative number ko positive bana do
        if (number < 0) {
            number = -number;
        }

        long sum = 0;

        for (; number != 0; number = number / 10) {
            long digit = number % 10;
            sum += digit;
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}