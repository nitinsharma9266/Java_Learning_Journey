package OOPs.Abstraction;
// Parent class
abstract class AnimalForConstructor {

    AnimalForConstructor() {
        System.out.println("Abstract Class Constructor Called");
    }
}
// child class
class DogForConstructor extends AnimalForConstructor {

    DogForConstructor() {
        System.out.println("Dog Constructor Called");
    }
}

public class AbstractConstructorDemo {

    public static void main(String[] args) {

        DogForConstructor dog = new DogForConstructor();
        System.out.println(dog);
    }
}