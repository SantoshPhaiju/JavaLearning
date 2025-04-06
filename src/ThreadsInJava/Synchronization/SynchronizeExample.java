package ThreadsInJava.Synchronization;

public class SynchronizeExample {
    private int amount = 1000;

    public synchronized void withdraw(int amount) {
        if (this.amount >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            this.amount -= amount;
            System.out.println(Thread.currentThread().getName() + " finished withdrawal. Balance: " + this.amount);
        } else {
            System.out.println(Thread.currentThread().getName() + " not enough balance for withdrawal.");
        }
    }

    public int getBalance() {
        return this.amount;
    }
}
