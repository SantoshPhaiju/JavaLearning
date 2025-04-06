package ThreadsInJava.Synchronization;

public class Main {
    public static void main(String[] args) {
//        SynchronizeExample example = new SynchronizeExample();
//
//        Thread customer1 = new Thread(() -> example.withdraw(300), "Customer 1");
//        Thread customer2 = new Thread(() -> example.withdraw(300), "Customer 2");
//
//
//        customer1.start();
//        customer2.start();


        CounterVariable counter = new CounterVariable();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // The count will be 2000 as synchronization is applied only to the critical section
        System.out.println("Data Downloaded " + counter.getCount() + "%");
    }
}
