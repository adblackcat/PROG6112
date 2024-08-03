import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        // array to hold the counts for numbers 0 through 9
        int[] counts = new int[10];

        // Random object to generate random numbers
        Random rand = new Random();

        // 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(10);
            counts[randomNumber]++;
        }

        // Display the count for each number
        System.out.println("Number of occurrences of each digit from 0 to 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
