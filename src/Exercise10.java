import java.util.Scanner;

public class Exercise10 {

    // find the index of the smallest element in an array of integers
    public static int indexOfSmallestElement(double[] array) {
        int minIndex = 0;  // Assume the first element is the smallest
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;  // Update minIndex if a smaller element is found
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //array to hold ten double values
        double[] numbers = new double[10];

        // enter ten double values
        System.out.println("Enter ten double values:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }

        // display the result
        int minIndex = indexOfSmallestElement(numbers);
        System.out.println("The index of the smallest element is: " + minIndex);

        input.close();
    }
}
