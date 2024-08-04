import java.util.Scanner;

public class Exercise25 {

    public static boolean isConsecutiveFour(int[] values) {
        // Check if the array has less than 4 elements
        if (values.length < 4) {
            return false;
        }

        // check for four consecutive identical numbers
        for (int i = 0; i <= values.length - 4; i++) {
            if (values[i] == values[i + 1] &&
                    values[i] == values[i + 2] &&
                    values[i] == values[i + 3]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //enter the number of values
        System.out.print("Enter the number of values: ");
        int size = scanner.nextInt();

        // insert the series of integers
        int[] values = new int[size];
        System.out.print("Enter the series of values: ");
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextInt();
        }

        // Check for four consecutive numbers
        if (isConsecutiveFour(values)) {
            System.out.println("The series contains four consecutive numbers with the same value.");
        } else {
            System.out.println("The series does not contain four consecutive numbers with the same value.");
        }

        scanner.close();
    }
}
