package Function;
import java.util.Scanner;
public class Larger_of_Two_Numbers {
    public static int larger_Number(int a,int b){
        if(a>b){
            return a;
        }
        else{
            
            return b;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a=sc.nextInt();
        System.out.println("Enter the value of b :");
        int b=sc.nextInt();
        int result=larger_Number(a,b);
        System.out.println("Greater element in a and b : "+result);
        sc.close();
    }
}
