import java.util.Scanner;

public class volumeofsphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius :");
        double r=sc.nextDouble();
        System.out.print("volume of sphere :");
        double volume=1.33*3.14*r*r*r;
        System.out.println(volume);
        sc.close();
    }
}
