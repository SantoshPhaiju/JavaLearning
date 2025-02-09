package Assignments;

import java.util.Scanner;

public class Assignment1 {
//    Write a java program to find the largest number from the three numbers taken from the user.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter first number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter first number: ");
        int num3 = scanner.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if ( num2 > num3) {
            System.out.println(num2 + " is greater");
        }else {
            System.out.println(num3 + " is greater");
        }

    }
}
