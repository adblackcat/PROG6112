import java.util.Scanner;

public class Exercise8 {

    // Method to calculate the average of an array of integers
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Method to calculate the average of an array of doubles
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to hold ten double values
        double[] numbers = new double[10];

        // Prompt the user to enter ten double values
        System.out.println("Enter ten double values:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // Invoke the average method for the double array and display the result
        double avg = average(numbers);
        System.out.println("The average value is: " + avg);

        input.close();
    }
}
