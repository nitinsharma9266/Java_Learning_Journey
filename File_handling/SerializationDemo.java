package File_handling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        try{
            Student s=new Student(101, "Nitin", 95.5);

            FileOutputStream fos=new FileOutputStream("student.dat");

            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.close();
            fos.close();

            System.out.println("Object saved successfully .");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
