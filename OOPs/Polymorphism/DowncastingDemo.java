
package OOPs.Polymorphism;

/*
===============================================================================
Topic      : Downcasting
Concept    : Runtime Polymorphism
Level      : Beginner
Used In    : Android Development
File Name  : DowncastingDemo.java
===============================================================================
*/

class AnimalForDowncasting {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class DogForDowncasting extends AnimalForDowncasting {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }

    void bark() {
        System.out.println("Dog is Barking...");
    }
}

public class DowncastingDemo {

    public static void main(String[] args) {

        // Upcasting
        AnimalForDowncasting animal = new DogForDowncasting();

        animal.sound();

        System.out.println("----------------------");

        // Downcasting
        DogForDowncasting dog = (DogForDowncasting) animal;

        dog.sound();
        dog.bark();
    }
}