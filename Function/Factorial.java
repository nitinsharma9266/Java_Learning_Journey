package Function;

import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {

        if (n < 0) {
            return -1;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        long result = factorial(n);

        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + n + " = " + result);
        }

        sc.close();
    }
}