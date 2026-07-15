package Arrays;

public class FrequencyCount {
    public static void main(String[] args) {
        int arr[]={10,20,10,30,40};
        int count=0;
        int key=10;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==key) {
               count++;
            }
            
        }
        System.out.printf("Frequency of %d  is : %d ",key,count);
        
    }
}
