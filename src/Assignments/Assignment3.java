package Assignments;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        // Write a Java program to print the area and perimeter of a rectangle, circle and square.
        Scanner scanner = new Scanner(System.in);
        final float PI = 3.1416f;

        System.out.println("Enter a number to print the area and perimeter of:");
        System.out.println("1 => Rectangle  2 => Circle  3 => Square");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("Enter length of rectangle: ");
                float length = scanner.nextFloat();
                System.out.println("Enter breadth of rectangle: ");
                float breadth = scanner.nextFloat();
                float area = length * breadth;
                float perimeter = 2 * (length + breadth);
                System.out.printf("Rectangle - Area: %.2f m², Perimeter: %.2f m%n", area, perimeter);
                break;

            case 2:
                System.out.println("Enter radius of the circle: ");
                float radius = scanner.nextFloat();
                float carea = PI * radius * radius;
                float cperimeter = 2 * PI * radius;
                System.out.printf("Circle - Area: %.2f m², Perimeter: %.2f m%n", carea, cperimeter);
                break;

            case 3:
                System.out.println("Enter length of a side of square: ");
                float side = scanner.nextFloat();
                float squareArea = side * side;
                float squarePerimeter = 4 * side;
                System.out.printf("Square - Area: %.2f m², Perimeter: %.2f m%n", squareArea, squarePerimeter);
                break;

            default:
                System.out.println("Invalid Input! Please enter 1, 2, or 3.");
        }

        scanner.close(); // Close scanner
    }
}
