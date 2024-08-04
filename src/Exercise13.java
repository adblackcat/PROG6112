import java.util.Scanner;

public class Exercise13 {

    //find the GCD of two numbers using the Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //find the GCD of an unspecified number of integers
    public static int gcd(int... numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = gcd(result, numbers[i]);
            if (result == 1) {
                // If GCD is 1, it is the smallest possible, so we can stop early
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        //enter five numbers
        System.out.println("Enter five numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the GCD of the entered numbers
        int gcdResult = gcd(numbers);

        // Display the GCD
        System.out.println("The GCD of the entered numbers is: " + gcdResult);
    }
}
