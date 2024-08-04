import java.util.Scanner;

public class Exercise23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // enter 10 integers
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Display all combinations
        System.out.println("All combinations of picking two numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
            }
        }

        scanner.close();
    }
}
