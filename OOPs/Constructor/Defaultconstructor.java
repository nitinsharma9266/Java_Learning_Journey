package OOPs.Constructor;
// class Student{
//     Student(){
//         System.out.println("Student object created!");
//     }
// }

class Car{
    String brand="BMW";
    Car(){
        System.out.println("Car Created!");
    }
}
public class Defaultconstructor {
    public static void main(String[] args) {
        //Student s1=new Student();
        //System.out.println(s1);

        Car c=new Car();
        System.out.println("Car Brand : "+c.brand);
    }
}
