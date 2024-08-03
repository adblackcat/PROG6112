import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to hold distinct numbers, with a maximum of 10 elements
        int[] distinctNumbers = new int[10];
        int count = 0;

        // enter ten numbers
        System.out.println("Enter ten numbers:");

        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();

            // Check if the number is already in the distinctNumbers array
            if (!isInArray(distinctNumbers, number, count)) {
                distinctNumbers[count] = number;
                count++;
            }
        }

        // Display the number of distinct numbers
        System.out.println("The number of distinct numbers is: " + count);
        System.out.print("The distinct numbers are: ");
        for (int i = 0; i < count; i++) {
            System.out.print(distinctNumbers[i] + " ");
        }

        input.close();
    }

    // check if a number is already in the array
    public static boolean isInArray(int[] array, int number, int size) {
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
