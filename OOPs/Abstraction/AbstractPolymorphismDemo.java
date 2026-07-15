package OOPs.Abstraction;

/*
===============================================================================
Topic      : Runtime Polymorphism with Abstract Class
Concept    : Abstract Parent + Child Object
Level      : Intermediate
Used In    : Android Development
File Name  : AbstractPolymorphismDemo.java
===============================================================================
*/

// Abstract Parent Class
abstract class AnimalForPolymorphism {

    // Normal Method
    void eat() {
        System.out.println("Animal is Eating...");
    }

    // Abstract Method
    abstract void sound();
}

// Child Class 1
class DogForPolymorphism extends AnimalForPolymorphism {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

// Child Class 2
class CatForPolymorphism extends AnimalForPolymorphism {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

public class AbstractPolymorphismDemo {

    public static void main(String[] args) {

        // Upcasting
        AnimalForPolymorphism animal;

        animal = new DogForPolymorphism();
        animal.eat();
        animal.sound();

        System.out.println("-----------------------");

        animal = new CatForPolymorphism();
        animal.eat();
        animal.sound();
    }
}