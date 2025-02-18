package Projects.PasswordGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int highScore = Integer.MAX_VALUE;  // Track the best score (lowest attempts)
        while (true) {
            // Personalized greeting
            System.out.println("Enter your name:");
            String playerName = scanner.nextLine();
            System.out.println("Welcome " + playerName + " to the Number Guessing Game!");

            // Select Difficulty Level
            System.out.println("Select Difficulty Level:");
            System.out.println("1. Easy (1-50)");
            System.out.println("2. Medium (1-100)");
            System.out.println("3. Hard (1-200)");
            int difficulty = scanner.nextInt();
            int maxRange = (difficulty == 1) ? 50 : (difficulty == 2) ? 100 : 200;

            // Initialize game
            int trueNumber = (int) (Math.random() * maxRange) + 1;
            int guessedNumber, count = 0, maxAttempts = 10, score;
            long startTime = System.currentTimeMillis();  // Start timer
            List<Integer> guesses = new ArrayList<>();

            System.out.println("Guess a number between 1 and " + maxRange + ":");

            // Game loop
            while (count < maxAttempts) {
                guessedNumber = scanner.nextInt();
                count++;
                guesses.add(guessedNumber);

                // Check if time's up
                if (System.currentTimeMillis() - startTime > 30000) {
                    System.out.println("Time's up! The correct number was: " + trueNumber);
                    break;
                }

                if (guessedNumber > trueNumber) {
                    System.out.println("The number is smaller than " + guessedNumber);
                } else if (guessedNumber < trueNumber) {
                    System.out.println("The number is larger than " + guessedNumber);
                } else {
                    System.out.println("🎉 Congratulations! You guessed the correct number: " + trueNumber);
                    break;
                }

                // Provide hint after every 3 guesses
                if (count % 3 == 0) {
                    System.out.println("Hint: The number is " + (trueNumber % 2 == 0 ? "even" : "odd"));
                }

                System.out.println("Previous guesses: " + guesses);
                System.out.println("Try again:");
            }

            // End game: Show score
            score = 100 - (count * 5);
            if (score < 0) score = 0;
            System.out.println("Your score: " + score);

            // Update high score
            if (count < highScore) {
                highScore = count;
                System.out.println("New High Score! You took " + count + " attempts.");
            } else {
                System.out.println("Your best score: " + highScore + " attempts.");
            }

            // Ask to play again or exit
            System.out.println("Enter 1 to play again or 2 to exit:");
            int choice = scanner.nextInt();
            if (choice != 1) {
                System.out.println("Thanks for playing, " + playerName + "! 🎮");
                break;
            }
        }
        scanner.close();
    }
}
