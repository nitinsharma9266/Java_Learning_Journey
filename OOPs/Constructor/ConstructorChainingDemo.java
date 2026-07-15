package OOPs.Constructor;
class StudentChaining{
    String name;
    int age;

    StudentChaining(){
        System.out.println("Defaul constructor");
    }
    StudentChaining(String name){
        this();
        this.name=name;
        System.out.println("Name : "+name);
    }
    StudentChaining(String name,int age){
        this(name);
        this.age=age;
        System.out.println("Age : "+age);

    }
    void Display(){
        System.out.println();
        System.out.println("Final Object Data ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
public class ConstructorChainingDemo {

    public static void main(String[] args) {

        StudentChaining s =new StudentChaining("Nitin",20);
        s.Display();    
    }
}