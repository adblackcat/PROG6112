import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array to hold 10 integers
        int[] numbers = new int[10];

        // enter 10 integers
        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Display the integers in reverse order
        System.out.println("The integers in reverse order are:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
