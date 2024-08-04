import java.util.Scanner;

public class Exercise28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"programming", "java", "hangman", "computer", "game", "openai"};
        boolean playAgain;

        do {
            // Randomly select a word from array
            String word = words[(int) (Math.random() * words.length)];
            char[] guessedWord = new char[word.length()];
            int misses = 0;
            boolean wordGuessed = false;
            // Initialize the guessed word with asterisks
            for (int i = 0; i < guessedWord.length; i++) {
                guessedWord[i] = '*';
            }

            while (!wordGuessed) {
                // Display the current state of the guessed word
                System.out.print("(Guess) Enter a letter in word ");
                System.out.println(guessedWord);

                // Get the user's guess
                char guess = scanner.next().charAt(0);
                boolean correctGuess = false;
                boolean alreadyGuessed = false;

                // Check if the guessed letter is in the word
                for (int i = 0; i < word.length(); i++) {
                    if (guessedWord[i] == guess) {
                        alreadyGuessed = true;
                    }
                    if (word.charAt(i) == guess) {
                        guessedWord[i] = guess;
                        correctGuess = true;
                    }
                }

                if (alreadyGuessed) {
                    System.out.println(guess + " is already in the word.");
                } else if (!correctGuess) {
                    misses++;
                    System.out.println(guess + " is not in the word.");
                }

                // Check if the user has guessed the entire word
                wordGuessed = true;
                for (char c : guessedWord) {
                    if (c == '*') {
                        wordGuessed = false;
                        break;
                    }
                }
            }

            // display result
            System.out.println("The word is " + word + ". You missed " + misses + " time(s).");
            System.out.print("Do you want to guess another word? Enter y or n: ");
            playAgain = scanner.next().toLowerCase().charAt(0) == 'y';
        } while (playAgain);

        scanner.close();
    }
}
