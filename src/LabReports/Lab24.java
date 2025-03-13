package LabReports;

import java.util.Scanner;

public class Lab24 {
    public static void validateNegativeNumber(int num) throws NegativeNumberException {
        if (num < 0) {
            throw new NegativeNumberException("Age cannot be negative");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age");
            int age = sc.nextInt();
            validateNegativeNumber(age);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
