// package OOPs.Polymorphism;

// /*
// ===============================================================================
// Topic      : Unsafe Downcasting
// Concept    : ClassCastException
// Level      : Beginner
// ===============================================================================
// */

// class AnimalForCasting {

//     void sound() {

//         System.out.println("Animal Sound");
//     }
// }

// class DogForCasting extends AnimalForCasting {

//     void bark() {

//         System.out.println("Dog Barking...");
//     }
// }

// public class UnsafeDowncastingDemo {

//     public static void main(String[] args) {

//         AnimalForCasting animal = new AnimalForCasting();

//         DogForCasting dog = (DogForCasting) animal;

//         dog.bark();
//     }
// }

package OOPs.Polymorphism;

/*
===============================================================================
Topic      : Safe Downcasting
Concept    : instanceof
Level      : Beginner
===============================================================================
*/

class AnimalForInstanceof {

    void sound() {

        System.out.println("Animal Sound");
    }
}

class DogForInstanceof extends AnimalForInstanceof {

    void bark() {

        System.out.println("Dog Barking...");
    }
}

public class SafeDowncastingDemo {

    public static void main(String[] args) {

        AnimalForInstanceof animal =
                new DogForInstanceof();

        if (animal instanceof DogForInstanceof) {

            DogForInstanceof dog =(DogForInstanceof) animal;

            dog.bark();

        } else {

            System.out.println("Casting Not Possible");

        }
    }
}