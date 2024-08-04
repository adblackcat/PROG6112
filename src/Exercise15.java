import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        //student names and scores
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];

        // Read the names and scores
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.print("Enter the score of " + names[i] + ": ");
            scores[i] = scanner.nextInt();
        }

        // 2D array to associate names with scores
        String[][] students = new String[numberOfStudents][2];

        // Fill the 2D array with names and scores
        for (int i = 0; i < numberOfStudents; i++) {
            students[i][0] = names[i];
            students[i][1] = Integer.toString(scores[i]);
        }

        // Sort the students array based on scores in descending order
        Arrays.sort(students, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                return Integer.compare(Integer.parseInt(b[1]), Integer.parseInt(a[1]));
            }
        });

        // display the sorted list of students
        System.out.println("\nStudents in decreasing order of their scores:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i][0] + ": " + students[i][1]);
        }
    }
}
