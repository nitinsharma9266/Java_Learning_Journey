package Arrays;

public class MostFrequentElement {
    public static void main(String[] args) {

        int[] arr = {5, 7, 5, 8, 5, 9, 7};

        int maxFrequency = 0;
        int mostFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // Frequency count of arr[i]
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update most frequent element
            if (count > maxFrequency) {
                maxFrequency = count;
                mostFrequent = arr[i];
            }
        }

        System.out.println("Most Frequent Element : " + mostFrequent);
        System.out.println("Frequency : " + maxFrequency);
    }
}