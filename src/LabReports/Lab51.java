package LabReports;

public class Lab51 {
    public static void main(String[] args) {
        /*
            Write a Java program that:
            Generates a random double value between 0 and 100.
            Uses Math methods to round it, take the square root, and calculate the sine of the value.
         */

        double randomDouble = Math.random() * 100 + 1;
        System.out.println("Random double number: " + randomDouble);

        System.out.println("Rounded random value: " + Math.round(randomDouble));
        System.out.println("Square root of the value: " + Math.sqrt(randomDouble));
        System.out.println("Sine value: " + Math.sin(randomDouble));


    }
}
