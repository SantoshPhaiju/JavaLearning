package LabReports;

// write a program that checks if a number is positive, negative, or zero using both if and switch

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();

        // using if-else
        System.out.println("Using if-else: ");
        if (num > 0) {
            System.out.println("The number you entered is a positive number");

        } else if (num < 0) {
            System.out.println("The number you entered is a negative number");
        } else {
            System.out.println("The number you entered is zero");
        }

        // using switch case
        int check = num > 0 ? 1 : num < 0 ? -1 : 0;
        System.out.println("Using switch case: ");
        switch (check) {
            case 0:
                System.out.println("The number you entered is zero");
                break;
            case 1:
                System.out.println("The number you entered is positive number");
                break;
            case -1:
                System.out.println("The number you entered is negative number");
                break;
            default:
                System.out.println("Invalid number!");
        }

    }
}
