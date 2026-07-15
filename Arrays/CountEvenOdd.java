package Arrays;

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr={10 ,15 ,20, 25, 30};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0) {
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("Even elements in the array : "+evencount);
        System.out.println("Odd elements in the array : "+oddcount);
    }
}
