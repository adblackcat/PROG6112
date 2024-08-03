import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {
        // Array to hold the count of numbers 0 through 9
        int[] counts = new int[10];

        //generate random numbers
        Random random = new Random();

        // Generate 100 random integers between 0 and 9
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(10);
            counts[number]++;
        }

        // Display the counts for each number
        System.out.println("Occurrences of each number from 0 to 9:");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + ": " + counts[i]);
        }
    }
}
