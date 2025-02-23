package DSA;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to enqueue ");
        int number = scanner.nextInt();

        MyQueue newMyQueue = new MyQueue();
        newMyQueue.enQueue(number);
    }
}
