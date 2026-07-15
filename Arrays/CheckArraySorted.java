package Arrays;

import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the size of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println();
        System.out.print("Enter the Array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
        System.out.print("Display the array elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");   
        }
        System.out.println();
        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                isSorted=false;
                break;
            }
            
        }
        if(isSorted){
            System.out.println("Array is sorted!");
        }
        else{
            System.out.println("Array is not sorted!");
        }
        sc.close();
    }
}
