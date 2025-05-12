package LabReports;

class Task implements Runnable {
    private String name;

    Task(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " started");
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is working... " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
        System.out.println(name + " finished");
    }
}

public class Lab32 {
    public static void main(String[] args) {
        Task task1 = new Task("Low Priority Thread");
        Task task2 = new Task("High Priority Thread");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Main thread: All threads completed");
    }
}
