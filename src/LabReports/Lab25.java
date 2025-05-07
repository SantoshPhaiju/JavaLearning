package LabReports;

import java.util.Scanner;

public class Lab25 {
    public static void main(String[] args) {
        // Write a Java program to input two strings from the user, concatenate them, convert the result to uppercase, and display it.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String first = sc.nextLine();

        System.out.println("Enter second string: ");
        String second = sc.nextLine();

        String newString = first.concat(second);

        System.out.println(newString.toUpperCase());


    }
}
