package Exception_Handling;

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int num1 = 10;
            int num2 = 0;

            int result = num1 / num2;

            System.out.println("Result : " + result);

        }

        catch (ArithmeticException e) {

            System.out.println("Exception Name : " + e.getClass().getSimpleName());
            System.out.println("Message        : " + e.getMessage());
            System.out.println("Cannot divide by zero.");

        }

        finally {

            System.out.println("Finally Block Executed");

        }

        System.out.println("Program Ended");

    }

}