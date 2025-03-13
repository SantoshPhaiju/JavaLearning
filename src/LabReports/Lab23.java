package LabReports;


// Provide a scenario where the finally block ensures that essential cleanup is done regardless of an exception.
public class Lab23 {
    public static void main(String[] args) {
        try {
            System.out.println("Connecting to database...");
            int result = 10 / 0;
            System.out.println("result from database: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("Disconnecting from database...");
        }
    }
}
