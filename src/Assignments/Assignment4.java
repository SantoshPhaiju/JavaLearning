package Assignments;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        // Write a java program to find the average of 5 numbers.
        final int SIZE = 5;
        int[] nums = new int[SIZE];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < SIZE; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        float average = (float) sum / SIZE;

        System.out.println("The average of numbers you entered is: " + average);

    }
}
