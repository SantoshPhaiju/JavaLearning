package LabReports;

import java.util.Scanner;

public class Lab29 {
    public static void main(String[] args) {
        // Write a Java program to:
        //Append a string using StringBuffer
        //Insert a word at a specified position

        Scanner sc = new Scanner(System.in);

        StringBuffer sb = new StringBuffer();

        System.out.println("Enter a string to append: ");
        String appendStr = sc.nextLine();

        sb.append(appendStr);

        System.out.println("String after append: " + sb);

        System.out.println("Enter a word to insert: ");
        String word = sc.nextLine();
        System.out.println("Enter the position to insert the word: ");
        int position = sc.nextInt();

        sb.insert(position, word);

        System.out.println("String after insertion: " + sb);
        sc.close();

    }
}
