package LabReports;

//  Write a program to demonstrate the use of a final class and a final method.

final class Calculator {
    final void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class Lab19 {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        myCalculator.add(1, 2);
    }
}
