package LabReports;

import java.util.Random;

public class Lab53 {
    public static void main(String[] args) {
        /*
            Write a Java program that:
            Uses the Random class to generate and print 10 random integers between 1 and 50.
            Simulates rolling a six-sided die five times using random numbers.
         */
        Random rand = new Random();

        // Task 1: Generate and print 10 random integers between 1 and 50
        System.out.println("10 Random Integers between 1 and 50:");
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(50) + 1; // 1 to 50
            System.out.print(randomNum + " ");
        }

        System.out.println("\n\nRolling a six-sided dice 5 times:");

        // Task 2: Simulate rolling a die 5 times
        for (int i = 0; i < 5; i++) {
            int dieRoll = rand.nextInt(6) + 1; // 1 to 6
            System.out.println("Roll " + (i + 1) + ": " + dieRoll);
        }

    }
}
