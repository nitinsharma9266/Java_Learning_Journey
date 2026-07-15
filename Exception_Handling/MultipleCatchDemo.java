package Exception_Handling;

/*
===============================================================================
Topic      : Multiple Catch
Concept    : One try block with Multiple catch blocks
===============================================================================
*/

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            int arr[] = {10,20,30};

            System.out.println(arr[5]);

        }

        catch (ArithmeticException e) {

            System.out.println("Cannot Divide By Zero");

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid Array Index");

        }

        catch (NullPointerException e) {

            System.out.println("Null Value Found");

        }

        System.out.println("Program Ended");
    }
}