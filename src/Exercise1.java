import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create an array to hold the scores
        int[] scores = new int[numberOfStudents];

        // Enter the scores
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = input.nextInt();
        }

        // Determine the highest score
        int best = findBestScore(scores);

        // Assign and display grades
        for (int i = 0; i < numberOfStudents; i++) {
            char grade = assignGrade(scores[i], best);
            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }

    // find the best score
    public static int findBestScore(int[] scores) {
        int best = scores[0];
        for (int score : scores) {
            if (score > best) {
                best = score;
            }
        }
        return best;
    }

    // assign grades based on the score and best score
    public static char assignGrade(int score, int best) {
        if (score >= best - 10) {
            return 'A';
        } else if (score >= best - 20) {
            return 'B';
        } else if (score >= best - 30) {
            return 'C';
        } else if (score >= best - 40) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
