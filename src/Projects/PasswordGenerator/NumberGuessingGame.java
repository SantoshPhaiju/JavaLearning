package Projects.PasswordGenerator;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Loop for restarting the game
            System.out.println("================ WELCOME TO MY NUMBER GUESSING GAME ===============");
            System.out.println("Guess a number from 1 - 100");

            int trueNumber = (int) (Math.random() * 100) + 1; // Generates number between 1-100
            int guessedNumber;
            int count = 0;

            while (true) { // Loop for guessing the number
                guessedNumber = scanner.nextInt();
                count++;

                if (guessedNumber > trueNumber) {
                    System.out.println("The number is smaller than " + guessedNumber);
                } else if (guessedNumber < trueNumber) {
                    System.out.println("The number is larger than " + guessedNumber);
                } else {
                    System.out.println("🎉 Congratulations! You guessed the correct number: " + trueNumber);
                    System.out.println("You guessed the correct number in " + count + " times");
                    break;
                }
                System.out.println("Try again:");
            }

            // Ask if the user wants to play again
            System.out.println("Enter 1 to play again or 2 to exit:");
            int choice = scanner.nextInt();

            if (choice != 1) {
                System.out.println("Thanks for playing! 🎮");
                break;
            }
        }
        scanner.close();
    }
}
