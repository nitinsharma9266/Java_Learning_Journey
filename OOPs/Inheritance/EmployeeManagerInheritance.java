package OOPs.Inheritance;

class Employee {

    String name;
    double salary;

    void display(String name, double salary) {

        this.name = name;
        this.salary = salary;

        System.out.println("Employee Name   : " + name);
        System.out.println("Employee Salary : " + salary);
    }
}

class Manager extends Employee {

    String department;

    void displayDepartment(String department) {

        this.department = department;

        System.out.println("Department      : " + department);
    }
}

public class EmployeeManagerInheritance {

    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.display("Rahul", 14000);

        manager.displayDepartment("CSE");
    }
}