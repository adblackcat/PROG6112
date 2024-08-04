import java.util.Scanner;

public class Exercise21 {

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter first list
        System.out.print("Enter the number of elements for the first list followed by the elements: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }

        // enter second list
        System.out.print("Enter the number of elements for the second list followed by the elements: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }

        // Check if the lists are strictly identical
        boolean result = equals(list1, list2);

        // Output
        if (result) {
            System.out.println("The two lists are strictly identical.");
        } else {
            System.out.println("The two lists are not strictly identical.");
        }

        scanner.close();
    }
}
