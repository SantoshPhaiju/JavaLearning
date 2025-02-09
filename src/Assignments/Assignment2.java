package Assignments;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
//        Write a java program to  check if the number is even or odd.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
}
