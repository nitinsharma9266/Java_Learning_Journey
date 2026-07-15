class Emp{
    int eid;
    String name;
    String department;
    Emp(String nm){
        name=nm;
    }
    Emp(int id,String nm){
        eid=id;
        name=nm;

    }
}
public class constructor {
    public static void main(String[] args) {
        
        Emp e1 = new Emp("Ravi");
        System.out.println(e1.eid);
        System.out.println(e1.name);
        Emp e2 = new Emp(45,"Amit");
        System.out.println(e2.eid);
        System.out.println(e2.name);
        
    }
}

