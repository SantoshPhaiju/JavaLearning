package EDJavaMultithreadingMasterClass.LockFairness;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessLockExample {
    private final Lock newLock = new ReentrantLock(true);

    public void accessResource() {
        newLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            newLock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample example = new FairnessLockExample();

        Runnable newTask = example::accessResource;

        Thread t1 = new Thread(newTask, "Thread-1");
        Thread t2 = new Thread(newTask, "Thread-2");
        Thread t3 = new Thread(newTask, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }

}
