package ExamPreparation;

public class InterThreadCom {
    public static void main(String[] args) {
        Shared s = new Shared();

//        Thread t1 = new Thread(() -> {
//            try {
//                s.print();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    s.print();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(5000);
                s.resumeThread();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

        t1.start();
        t2.start();
        System.out.println("Main thread started");
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }
}

class Shared {
    synchronized void print() throws InterruptedException {
        System.out.println("Waiting...");
        wait(); // thread waits here
        System.out.println("Resumed...");
    }

    synchronized void resumeThread() {
        notify(); // resumes waiting thread
    }
}

