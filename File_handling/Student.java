package File_handling;
import java.io.Serializable;
public class Student implements Serializable {
    int id;
    String name;
    double marks;

    Student(int id,String name,double marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
}
