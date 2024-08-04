import java.util.Scanner;

public class Exercise16 {

    // perform bubble sort on an array of doubles
    public static void bubbleSort(double[] array) {
        int n = array.length;
        boolean swapped;

        // Loop over the array to make  passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // compare each pair of adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap if the pair is out of order
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // break if two elements were not swapped
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        //enter ten double numbers
        System.out.println("Enter ten double numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the numbers using bubble sort
        bubbleSort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers:");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
    }
}
