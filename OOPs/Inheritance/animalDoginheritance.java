package OOPs.Inheritance;
// Parent CLass
class Animal{
    void eat(){
        System.out.println("Animal is eating!");
    }
    void sleep(){
        System.out.println("Animal is sleeping!!");
    }
}
// Child class
class Dog extends Animal{
    void Bark(){
        System.out.println("Animal is barking!!");
    }
}
public class animalDoginheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.Bark();
        d.sleep();
        //System.out.println(d);
    }
}
