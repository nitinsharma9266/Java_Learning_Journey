package Exception_Handling;

public class FinallyDemo {

    public static void main(String[] args) {

        try {

            System.out.println("Inside Try");

            int x = 10 / 0;
            System.out.println(x);

        }

        catch (ArithmeticException e) {

            System.out.println("Exception Handled");

        }

        finally {

            System.out.println("Finally Block Executed");

        }

        System.out.println("Program End");

    }
}