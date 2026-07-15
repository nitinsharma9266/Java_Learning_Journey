/*
==============================================================

1. Abstract Method ki body nahi hoti.

2. Abstract Method sirf Abstract Class ke andar ho sakta hai.

3. Child Class ko Abstract Method implement karna compulsory hai.

4. Agar Child implement nahi kare,
   to Child ko bhi abstract banana padega.

5. Abstract Method ek Contract hota hai.

==============================================================

===============================================================================
Topic      : Abstract Method
Concept    : Child must provide implementation
Level      : Beginner
Used In    : Android Development
===============================================================================
*/
package OOPs.Abstraction;
abstract class AnimalForAbstractMethod {

    // Normal Method
    void eat() {
        System.out.println("Animal is Eating...");
    }

    // Abstract Method
    abstract void sound();
}

class DogForAbstractMethod extends AnimalForAbstractMethod {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class AbstractMethodDemo {

    public static void main(String[] args) {

        DogForAbstractMethod dog = new DogForAbstractMethod();

        dog.eat();

        dog.sound();

    }
}