import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number : ");
        int n=sc.nextInt();
        
        if(n>0){
            System.out.println("same number : "+n);
        }
        else{
            System.out.println("absolute number : "+(-n));
        }
        sc.close();
    }
}
