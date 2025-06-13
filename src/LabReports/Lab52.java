package LabReports;

public class Lab52 {
    public static void main(String[] args) {
        /*
            Write a Java program that:
            Converts a String to Integer, performs a calculation, and prints the result.
            Demonstrates autoboxing by assigning a primitive int to an Integer object.
         */
        String num1 = "43";
        int num2 = 55;

        int num3 = Integer.parseInt(num1) + num2;
        System.out.println("String number added to int: " + num3);

        // autoboxing example
        int myNum = 30;
        Integer numObj = myNum;
        System.out.println("autoboxing ex: " + numObj);
    }
}
