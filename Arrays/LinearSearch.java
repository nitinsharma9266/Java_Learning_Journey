package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of student marks : ");
        int n=sc.nextInt();
        
        int[] marks=new int[n];
        System.out.print("Enter the marks of students : ");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.print("Display the marks of student : ");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < marks.length; i++) {

            if (key == marks[i]) {
                System.out.printf("%d found at index %d%n", key, i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}