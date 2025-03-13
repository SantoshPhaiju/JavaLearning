package LabReports;


import java.util.Scanner;

// Write a program to implement and demonstrate user-defined exceptions.
public class Lab22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age!");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("You are not eligible to have driving license");
            } else {
                System.out.println("You are eligible to have a driving license");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
