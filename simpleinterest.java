import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter interest :");
        double p=sc.nextDouble();
        System.out.print("enter rate :");
        double r=sc.nextDouble();
        System.out.print("enter time :");
        int t=sc.nextInt();
        System.out.print("simple interest of the money in " + t +" years :");
        double si=(p*r*t)/100;
        System.out.print(si);
        sc.close();


    }
}
