package EDJavaMultithreadingMasterClass.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount + " from balance " + balance);
        try {
//            lock.lock(); // same as synchronized keyword
            if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " processing with withdrawal...");
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " withdrawal failed. Insufficient balance.");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire lock within 2000 millisecond. Aborting withdrawal. Will try again later.");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
        if (Thread.currentThread().isInterrupted()) {
            System.out.println("Thread interrupted");
        }
    }

/*
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount + " from balance " + balance);

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " processing with withdrawal...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " withdrawal failed. Insufficient balance.");
        }
    }
*/


}
