package LabReports;

// write a program that uses both break and continue in a loop
public class Lab10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numbers) {
            if (number % 2 == 0) {
                continue;
            }
            if (number == 9) {
                break;
            }
            System.out.println(number);
        }
    }
}
