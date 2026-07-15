import java.util.Scanner;

public class singlearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x=new int[10];
        System.out.println("Enter elements of this array :");
        for(int i=0;i<x.length;i++){
            x[i]=sc.nextInt();

        }
        System.out.println("\nArray elements:");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("\nArray elements:");
        for(int item:x){   // this is collection loop 
            System.out.print(item+" ");

        }
        sc.close();
    }
}
