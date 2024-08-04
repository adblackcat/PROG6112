import java.util.Random;

public class Exercise12 {

    public static int getRandom(int... numbers) {
        Random random = new Random();
        int randomNumber;

        // generate a random number until it's not in the exclusion list
        while (true) {
            randomNumber = random.nextInt(54) + 1; // Generates a number between 1 and 54
            boolean excluded = false;

            // Check if the randomNumber is in the list of numbers to exclude
            for (int number : numbers) {
                if (randomNumber == number) {
                    excluded = true;
                    break;
                }
            }

            // break out of the loop
            if (!excluded) {
                break;
            }
        }

        return randomNumber;
    }

    public static void main(String[] args) {
        // Example usage
        int[] excludedNumbers = {2, 5, 7, 9, 23, 45};
        int randomNum = getRandom(excludedNumbers);
        System.out.println("Random number (excluding " + java.util.Arrays.toString(excludedNumbers) + "): " + randomNum);
    }
}
