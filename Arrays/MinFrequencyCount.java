package Arrays;

public class MinFrequencyCount {
    public static void main(String[] args) {

        int[] arr = {5, 7, 5, 8, 5, 9, 7};

        int minFrequency = arr.length;
        int leastFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // Frequency count of arr[i]
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update least frequent element
            if (count < minFrequency) {
                minFrequency = count;
                leastFrequent = arr[i];
            }
        }

        System.out.println("Least Frequent Element : " + leastFrequent);
        System.out.println("Frequency : " + minFrequency);
    }
}