package OOPs.Constructor;
class Student{
    String Degree="BTECH";
    Student(String name,int age,String branch){
        System.out.println("Name is : "+name);
        System.out.println("age is : "+age);
        System.out.println("Branch is : "+branch);
    }
}
public class Parameterizedconstructor {
    public static void main(String[] args) {
        Student s=new Student("Nitin",18,"Computer Science and Engneering");
        System.out.println("Degree is : "+s.Degree);
    }
}
