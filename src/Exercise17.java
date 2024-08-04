import java.util.Scanner;

public class Exercise17 {

    // check if the array is sorted in increasing order
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                return false; // Return false if the current element is greater than the next
            }
        }
        return true; // Return true if no elements are out of order
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the number of elements
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();

        // Initialize the array with the number of elements
        int[] list = new int[numElements];

        //enter the elements of the list
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < numElements; i++) {
            list[i] = scanner.nextInt();
        }

        // Check if the list is sorted
        boolean sorted = isSorted(list);

        // Display the result
        if (sorted) {
            System.out.println("The list is sorted in increasing order.");
        } else {
            System.out.println("The list is not sorted.");
        }
    }
}
