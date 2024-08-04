import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise24 {

    public static void main(String[] args) {
        int targetSum = 24;
        int pickCount = 0;

        while (true) {
            // Create and shuffle the deck
            List<Integer> deck = createDeck();
            Collections.shuffle(deck);

            // Pick the first four cards
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int cardValue = getCardValue(deck.get(i));
                sum += cardValue;
            }

            pickCount++;

            // Check if the sum of the picked cards is 24
            if (sum == targetSum) {
                System.out.println("Found a combination with sum 24 after " + pickCount + " picks.");
                break;
            }
        }
    }

    // create a deck of 52 cards
    public static List<Integer> createDeck() {
        List<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            deck.add((i - 1) % 13 + 1);
        }
        return deck;
    }

    // get the card value based on its rank
    public static int getCardValue(int rank) {
        switch (rank) {
            case 11:
                return 11; // Jack
            case 12:
                return 12; // Queen
            case 13:
                return 13; // King
            default:
                return rank; // 1-10, where Ace is 1
        }
    }
}
