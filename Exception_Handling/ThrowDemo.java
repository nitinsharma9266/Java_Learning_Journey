package Exception_Handling;

import java.util.Scanner;

public class ThrowDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Age : ");
            int age = sc.nextInt();

            if (age < 18) {

                throw new ArithmeticException("You are not eligible to vote.");

            }

            System.out.println("You can vote.");

        }

        catch (ArithmeticException e) {

            System.out.println(e.getMessage());

        }

        finally {
            System.out.println();

            sc.close();   // Scanner hamesha close hoga

        }

    }

}