import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        long n=sc.nextLong();
        if(n%2==0){
            System.out.println("number is even !");
        }
        else{
            System.out.println("number is odd");
        }
        sc.close();
    }
}
