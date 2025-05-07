package LabReports;

import java.util.Scanner;

public class lab26 {
    public static void main(String[] args) {
        // write a Java program that accepts a string and a character from the user, and displays the number of times that character appears in the string.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Enter a character in the string to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The character '" + ch + "' appears " + count + " times.");

        sc.close();

    }
}
