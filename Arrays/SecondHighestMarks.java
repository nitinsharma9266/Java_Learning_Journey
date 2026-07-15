package Arrays;

public class SecondHighestMarks {
    public static void main(String[] args) {

        int[] marks = {20, 70, 40, 90, 80};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] > highest) {

                secondHighest = highest;
                highest = marks[i];

            } else if (marks[i] > secondHighest && marks[i] != highest) {

                secondHighest = marks[i];
            }
        }

        System.out.println("Highest Marks: " + highest);
        System.out.println("Second Highest Marks: " + secondHighest);
    }
}