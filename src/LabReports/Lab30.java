package LabReports;

public class Lab30 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // pause for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }


    public static void main(String[] args) {
        // Write a Java program to create a thread by extending the Thread class. The thread should print numbers from 1 to 5.

        Lab30 t1 = new Lab30();
        t1.start();



    }
}
