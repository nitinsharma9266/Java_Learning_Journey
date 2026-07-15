package Exception_Handling;

// public class ExceptionHierarchyDemo {

//     public static void main(String[] args) {

//         try {

//             int result = 10 / 0;
//             System.out.println(result);

//         }

//         catch (ArithmeticException e) {

//             System.out.println("Arithmetic Exception");

//         }

//         catch (RuntimeException e) {

//             System.out.println("Runtime Exception");

//         }

//         catch (Exception e) {

//             System.out.println("Exception");

//         }

//         catch (Throwable e) {

//             System.out.println("Throwable");

//         }

//     }

// }



/*
=============================================================
Topic : try-catch
Concept : Handling ArithmeticException
=============================================================
*/

public class TryCatchDemo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int result = 10 / 0;

            System.out.println(result);

        }

        catch (Exception e) {

            System.out.println("Cannot Divide By Zero");

        }

        System.out.println("Program Ended");

    }
}