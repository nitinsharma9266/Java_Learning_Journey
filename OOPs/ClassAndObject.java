package OOPs;

class Student {

    String name = "Nitin";
    int age = 18;
    String branch = "Computer Science and Engineering";

}
public class ClassAndObject {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name   : " + s1.name);
        System.out.println("Age    : " + s1.age);
        System.out.println("Branch : " + s1.branch);

    }
}