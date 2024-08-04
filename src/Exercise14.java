import java.util.Scanner;
import java.util.ArrayList;

public class Exercise14 {

    // eliminate duplicates from an array
    public static int[] eliminateDuplicates(int[] list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        // Iterate through the original array
        for (int number : list) {
            // If the uniqueList does not already contain the number, add it
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            result[i] = uniqueList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // enter ten integers
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Eliminate duplicates and get the result array
        int[] uniqueNumbers = eliminateDuplicates(numbers);

        // Display the result
        System.out.println("The unique numbers are:");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
    }
}
