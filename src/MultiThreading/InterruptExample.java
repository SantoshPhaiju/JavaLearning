package MultiThreading;

public class InterruptExample extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
    InterruptExample t1 = new InterruptExample();
    t1.start();
    t1.interrupt();
    }
}
