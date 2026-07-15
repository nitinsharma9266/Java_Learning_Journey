package OOPs.Inheritance;
class Vehicle{
    void Start(){
        System.out.println("Car being starting !!");
    }
    void stop(){
        System.out.println("Car is being stop!!");
    }
}
class Car extends Vehicle{
    void Drive(){
        System.out.println("Car is driving");
    }
}
public class VehicleCarInheritance {
    public static void main(String[] args) {
        Car c=new Car();
        
        c.Start();
        c.stop();
        c.Drive();
    }
}
