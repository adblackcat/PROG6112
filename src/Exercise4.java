import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to hold up to 100 scores
        int[] scores = new int[100];
        int count = 0;
        int sum = 0;

        // Enter marks
        System.out.println("Enter scores (negative number to end):");

        while (true) {
            int score = input.nextInt();

            // Break the loop if a negative number is entered
            if (score < 0) {
                break;
            }

            // Add score to the array if it doesn't exceed the maximum count
            if (count < 100) {
                scores[count] = score;
                sum += score;
                count++;
            }
        }

        // Calculate the average
        double average = sum / (double) count;

        // Determine how many scores are above or equal to the average and how many are below
        int aboveOrEqual = 0;
        int below = 0;

        for (int i = 0; i < count; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        // Display the results
        System.out.println("Average score: " + average);
        System.out.println("Number of scores above or equal to the average: " + aboveOrEqual);
        System.out.println("Number of scores below the average: " + below);

        input.close();
    }
}
