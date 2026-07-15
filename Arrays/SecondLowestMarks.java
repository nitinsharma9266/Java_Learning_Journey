package Arrays;

public class SecondLowestMarks {
    public static void main(String[] args) {
        int[] marks = {20, 70, 40, 90, 80};

        int lowest = Integer.MAX_VALUE;
        int secondlowest = Integer.MAX_VALUE;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < lowest) {

                secondlowest = lowest;
                lowest = marks[i];

            } else if (marks[i] < secondlowest&& marks[i] != lowest) {

                secondlowest = marks[i];
            }
        }

        System.out.println("lowest Marks: " + lowest);
        System.out.println("Second lowest Marks: " + secondlowest);
    }
}
