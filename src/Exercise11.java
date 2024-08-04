import java.util.Scanner;

public class Exercise11 {

    //reverse an array in place
    public static int[] reverse(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // enter ten numbers
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Reverse the array
        reverse(numbers);

        // Display the reversed numbers
        System.out.println("Reversed numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
