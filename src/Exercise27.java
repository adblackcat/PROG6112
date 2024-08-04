import java.util.Arrays;
import java.util.Scanner;

public class Exercise27 {

    public static String sort(String s) {
        // Convert the string to a character array
        char[] charArray = s.toCharArray();
        // Sort the character array
        Arrays.sort(charArray);
        // Convert the sorted character array back to a string and return it
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Sort the string
        String sortedString = sort(input);

        // Display the sorted string
        System.out.println("The sorted string is: " + sortedString);

        scanner.close();
    }
}
