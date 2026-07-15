package OOPs.Polymorphism;

/*
===============================================================================
Topic      : Polymorphism with Methods
Concept    : Parent Reference as Method Parameter
Level      : Beginner
Used In    : Android Development
===============================================================================
*/

class AnimalForMethod {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class DogForMethod extends AnimalForMethod {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

class CatForMethod extends AnimalForMethod {

    @Override
    void sound() {
        System.out.println("Cat Meows");
    }
}

class Hospital {

    void checkAnimal(AnimalForMethod animal) {

        animal.sound();

    }
}

public class PolymorphismWithMethodsDemo {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.checkAnimal(new DogForMethod());

        hospital.checkAnimal(new CatForMethod());

    }
}