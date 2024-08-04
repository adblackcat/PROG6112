import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class Exercise20 {

    public static void main(String[] args) {
        // Define the suits
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        Random random = new Random();
        Set<String> pickedSuits = new HashSet<>();
        int pickCount = 0;

        // Array to store the picked cards
        String[] pickedCards = new String[52];

        // Simulate the card picking process
        while (pickedSuits.size() < suits.length) {
            // Randomly pick a card
            int suitIndex = random.nextInt(suits.length);
            String card = suits[suitIndex];

            // Store the picked card
            pickedCards[pickCount] = card;
            pickCount++;

            // Add the suit to the set of picked suits
            pickedSuits.add(card);
        }

        // Print the results
        System.out.println("Total number of picks needed: " + pickCount);
        System.out.println("Picked cards:");
        for (int i = 0; i < pickCount; i++) {
            System.out.print(pickedCards[i] + " ");
        }
        System.out.println();
    }
}
