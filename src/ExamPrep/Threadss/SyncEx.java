package ExamPrep.Threadss;

class BankAccount {
    int balance = 1000;

     synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw ₹" + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance: ₹" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " can't withdraw. Insufficient balance.");
        }
    }
}

class MyRunnable implements Runnable {
    private final BankAccount account;

    public MyRunnable(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("running");
        account.withdraw(800);
    }
}

public class SyncEx {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        MyRunnable myRunnable = new MyRunnable(account);
//        Thread t1 = new Thread(() -> account.withdraw(700), "Thread-1");
//        Runnable myRunnable = new Runnable() {
//            @Override
//            public void run() {
//                account.withdraw(700);
//            }
//        };

        Thread t1 = new Thread(myRunnable, "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "Thread-2");

        t1.start();
        t2.start();
    }
}
