import java.util.Scanner;

public class Exercise3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array to count occurrences, indices represent numbers from 1 to 100
        int[] counts = new int[100];

        // enter numbers
        System.out.println("Enter numbers between 1 and 100 (end with 0):");

        while (true) {
            int number = input.nextInt();

            // If the input is 0, break the loop
            if (number == 0) {
                break;
            }

            // Increment the count for the entered number
            if (number >= 1 && number <= 100) {
                counts[number - 1]++;
            }
        }

        // Display the occurrences of each number
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
            }
        }

        input.close();
    }
}
