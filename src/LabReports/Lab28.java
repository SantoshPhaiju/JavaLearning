package LabReports;

import java.util.Scanner;

public class Lab28 {
    public static void main(String[] args) {
        // Write a Java program to replace all vowels in a string with * and print the modified string.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String modifiedString = input.replaceAll("[aeiouAEIOU]", "*");

        // Display the result
        System.out.println("Modified string: " + modifiedString);

        sc.close();
    }
}
