package LabReports;


// Write a program to demonstrate implicit and explicit type casting
public class Lab7 {
    public static void main(String[] args) {
        // ** Implicit Type Casting
        int myInt = 100;
        double myDouble = myInt; // automatically converts int to double

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Converted to Double: " + myDouble);

        // **Explicit Type Casting (Narrowing)**
        double myDouble2 = 99.99;
        int myInt2 = (int) myDouble2; // Manually converting double to int

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double value: " + myDouble2);
        System.out.println("Converted to Integer: " + myInt2);
    }
}
