package OOPs.Inheritance;

import java.util.Scanner;

class Person{
    String name;
    int age;
    void display(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
    }
}
class student extends Person{
    long rollno;
    void Rollno(long rollno){
        this.rollno=rollno;
        System.out.println("Roll number : "+rollno);
    }
}
public class PersonStudentInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
        System.out.println("enter yor age : ");
        int age=sc.nextInt();
        System.err.println("Enter your Roll number : ");
        long rollno=sc.nextLong();

        student s=new student();
        s.display(name, age);
        s.Rollno(rollno);
        sc.close();
        
    }
}
