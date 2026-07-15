package OOPs.Encapsulation;

import java.util.Scanner;

class Student{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name != null && !name.trim().isEmpty()){

            this.name=name;

        }

        else{

            System.out.println("Invalid Name");

        }
    }
    public int getAge(){
        return age;
    }
    public boolean setAge(int age){
        if (age>=1 && age<=120) {
                this.age=age;
                return true;
            }
        else{
            return false;
        }        
    }
}
public class StudentEncapsulationDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();

        System.out.println("Enter your age : ");
        int age=sc.nextInt();

        Student s=new Student();

        s.setName(name);
        s.setAge(age);

        System.out.println("Your Name : "+ s.getName());
        
        if (s.setAge(age)) {
            System.out.println("Age : " + s.getAge());
        } else {
            System.out.println("Age was not updated.");
        }
        sc.close();
    }
    
    
} 