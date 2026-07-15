import java.util.Scanner;

public class integerornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        double n=sc.nextDouble();
        int x=(int)n;
        if(n==x){
            System.out.println("number is integer ");
        }
        else{
            System.out.println("number is not integer(double) !");
        }
        sc.close();
    }
}
