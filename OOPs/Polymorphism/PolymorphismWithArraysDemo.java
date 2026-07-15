package OOPs.Polymorphism;

/*
===============================================================================
Topic      : Polymorphism with Arrays
Concept    : Parent Array + Child Objects
Level      : Beginner
Used In    : Android Development
===============================================================================
*/

class AnimalForArray {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class DogForArray extends AnimalForArray {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class CatForArray extends AnimalForArray {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

class CowForArray extends AnimalForArray {

    @Override
    void sound() {
        System.out.println("Cow Moos");
    }
}

public class PolymorphismWithArraysDemo {

    public static void main(String[] args) {

        AnimalForArray[] animals = {

                new DogForArray(),

                new CatForArray(),

                new CowForArray()

        };

        for (AnimalForArray animal : animals) {

            animal.sound();

        }

    }

}