package OOPs.Constructor;

// Student Class
class StudentCopy {

    String name;
    int age;

    // Parameterized Constructor
    StudentCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    StudentCopy(StudentCopy obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    // Display Method
    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

// Main Class
public class CopyConstructorDemo {

    public static void main(String[] args) {

        // First Object
        StudentCopy s1 = new StudentCopy("Nitin", 20);

        // Second Object (Copy of s1)
        StudentCopy s2 = new StudentCopy(s1);

        System.out.println("Student 1 Details");
        s1.display();

        System.out.println();

        System.out.println("Student 2 Details");
        s2.display();
    }
}