package LabReports;


import java.util.Scanner;

public class Lab27 {
    public static void main(String[] args) {
        // Write a Java program that checks if two given strings are equal (case-insensitive), and prints "Equal" or "Not Equal".

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        sc.close();



    }
}
