import java.util.Scanner;;
public class Threesidetriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The first side of the triangle : ");
        int a=sc.nextInt();
        System.out.print("Enter the second side of the trangle : ");
        int b=sc.nextInt();
        System.out.print("enter The third side of the triangle : ");
        int c=sc.nextInt();
        if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("Not a valid triangle!");
        }
        else if(a==b&&b==c){
            System.out.println("The triangle is equileteral!");
        }
        else if(a==b||b==c||c==a){
            System.out.println("The triangle is Isoscale!");
        }
        else if(a!=b && b!=c && c!=a){
            System.out.println("The triangle is scalane!");
        }
        sc.close();
    }
}
