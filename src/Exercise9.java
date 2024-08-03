import java.util.Scanner;

public class Exercise9 {

    // find the minimum value in an array of double values
    public static double min(double[] array) {
        double minValue = array[0];  // Assume the first element is the minimum
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];  // Update minValue if a smaller value is found
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array to hold ten double values
        double[] numbers = new double[10];

        // enter ten double values
        System.out.println("Enter ten double values:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // find the minimum value and display the result
        double minValue = min(numbers);
        System.out.println("The minimum value is: " + minValue);

        input.close();
    }
}
