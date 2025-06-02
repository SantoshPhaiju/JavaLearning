package MultiThreading;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 is running");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t1 = new MyThread2();
        t1.start();
        System.out.println("Main thread is waiting for t1 to complete it's task!");
        t1.join();
        System.out.println("Main thread waiting is completed!");

    }

}
