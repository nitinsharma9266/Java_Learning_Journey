package Exception_Handling;

public class ThrowsDemo {

    static void divide() throws ArithmeticException {

        int result = 10 / 0;
        System.out.println(result);
    }

    public static void main(String[] args) {

        try {

            divide();

        }

        catch (ArithmeticException e) {

            System.out.println("Exception Handled In Main");

        }

        System.out.println("Program End");

    }

}