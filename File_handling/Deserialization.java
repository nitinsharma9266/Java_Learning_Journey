package File_handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserialization {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("student.dat");

            ObjectInputStream ois=new ObjectInputStream(fis);

            Student s=(Student) ois.readObject();

            System.out.println("ID : "+s.id);
            System.out.println("Name : "+s.name);

            System.out.println("Marks : "+s.marks);

            ois.close();
            fis.close();
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
