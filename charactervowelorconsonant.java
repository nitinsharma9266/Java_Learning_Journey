import java.util.Scanner;
public class charactervowelorconsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println("The  character is vowel!");
        }
        else{
            System.out.println("The character is consonant!");
        }
        sc.close();

        
    }
}
