package LabReports;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab49 {
    public static void main(String[] args) {
        /*
         Write a Java program that:
         Reads a line of text from the user using BufferedReader.
         Converts the input to uppercase.
         Prints the uppercase string to the console.
         */

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a line of text: ");
            String input = reader.readLine();

            String upperCaseText = input.toUpperCase();

            System.out.println("Uppercase: " + upperCaseText);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }


    }
}
