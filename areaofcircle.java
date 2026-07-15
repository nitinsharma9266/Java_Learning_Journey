import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);   //input lene ke liye

        System.out.print("enter radius :"); // massege print karne ke liye. 

        double r=sc.nextDouble();// radius input li gayi.

        double area=3.14*r*r;

        System.out.println("Area of circle="+area);

        sc.close();
    
}

}
