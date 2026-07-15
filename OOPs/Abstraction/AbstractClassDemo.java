/*
==============================================================

1. Abstract Class ka object nahi ban sakta.

2. Abstract Class ko inherit kiya ja sakta hai.

3. Abstract Class Parent Blueprint hoti hai.

4. Child Classes uska implementation deti hain.

5. Abstract Class me normal methods bhi ho sakte hain.

==============================================================
===============================================================================
Topic      : Abstract Class
Concept    : Abstract Class cannot be instantiated
Level      : Beginner
Used In    : Android Development
===============================================================================
*/
package OOPs.Abstraction;
abstract class AnimalForAbstract {

    // Normal Method
    void eat() {
        System.out.println("Animal is Eating...");
    }
}

// Child Class
class DogForAbstract extends AnimalForAbstract {

    void bark() {
        System.out.println("Dog is Barking...");
    }
}

public class AbstractClassDemo {

    public static void main(String[] args) {

        // Object of Child Class
        DogForAbstract dog = new DogForAbstract();

        dog.eat();      // Parent Method
        dog.bark();     // Child Method

    }
}