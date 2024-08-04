import java.util.Scanner;

public class Exercise26 {

    public static int[] merge(int[] list1, int[] list2) {
        int[] mergedList = new int[list1.length + list2.length];
        int i = 0, j = 0, k = 0;

        // Merge two arrays
        while (i < list1.length && j < list2.length) {
            if (list1[i] <= list2[j]) {
                mergedList[k++] = list1[i++];
            } else {
                mergedList[k++] = list2[j++];
            }
        }

        // Copy remaining elements of list1
        while (i < list1.length) {
            mergedList[k++] = list1[i++];
        }

        // Copy remaining elements of list2
        while (j < list2.length) {
            mergedList[k++] = list2[j++];
        }

        return mergedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first list
        System.out.print("Enter the number of elements in the first list: ");
        int size1 = scanner.nextInt();
        int[] list1 = new int[size1];
        System.out.print("Enter the elements of the first list: ");
        for (int i = 0; i < size1; i++) {
            list1[i] = scanner.nextInt();
        }

        // Input for the second list
        System.out.print("Enter the number of elements in the second list: ");
        int size2 = scanner.nextInt();
        int[] list2 = new int[size2];
        System.out.print("Enter the elements of the second list: ");
        for (int i = 0; i < size2; i++) {
            list2[i] = scanner.nextInt();
        }

        // Merge the two sorted lists
        int[] mergedList = merge(list1, list2);

        // Output the merged list
        System.out.print("The merged list is: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
