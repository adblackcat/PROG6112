public class Exercise19 {

    public static void main(String[] args) {
        final int NUM_LOCKERS = 100;
        boolean[] lockers = new boolean[NUM_LOCKERS];

        // Simulate each student
        for (int student = 1; student <= NUM_LOCKERS; student++) {
            for (int locker = student - 1; locker < NUM_LOCKERS; locker += student) {
                lockers[locker] = !lockers[locker]; // Toggle the locker
            }
        }

        // Display the numbers of the lockers that are open
        System.out.print("Open lockers: ");
        for (int i = 0; i < NUM_LOCKERS; i++) {
            if (lockers[i]) {
                System.out.print((i + 1) + " ");
            }
        }
    }
}
