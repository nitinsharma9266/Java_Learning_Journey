package For_loops;

import java.util.Scanner;

public class sumof1ToN {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enetr the value of n : ");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            sum=sum+i;
        }
        System.out.println("Sum of one to N numbers "+sum);
        sc.close();
    }
}
