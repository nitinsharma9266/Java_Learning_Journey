package OOPs.Constructor;

public class ConstructorOverloadingDemo {

    // Default Constructor
    ConstructorOverloadingDemo() {
        System.out.println("Default Constructor Called");
    }

    // One Parameter Constructor
    ConstructorOverloadingDemo(String name) {
        System.out.println("Student Name : " + name);
    }

    // Two Parameter Constructor
    ConstructorOverloadingDemo(String name, int age) {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age  : " + age);
    }

    // Three Parameter Constructor
    ConstructorOverloadingDemo(String name, int age, String branch) {
        System.out.println("Student Name   : " + name);
        System.out.println("Student Age    : " + age);
        System.out.println("Student Branch : " + branch);
    }

    public static void main(String[] args) {

        System.out.println("Object 1");
        ConstructorOverloadingDemo s1 = new ConstructorOverloadingDemo();

        System.out.println(s1);

        System.out.println("Object 2");
        ConstructorOverloadingDemo s2 = new ConstructorOverloadingDemo("Nitin");

        System.out.println(s2);

        System.out.println("Object 3");
        ConstructorOverloadingDemo s3 = new ConstructorOverloadingDemo("Nitin", 20);

        System.out.println(s3);

        System.out.println("Object 4");
        ConstructorOverloadingDemo s4 = new ConstructorOverloadingDemo("Nitin", 20, "Computer Science Engineering");
        System.out.println(s4);
    }
}