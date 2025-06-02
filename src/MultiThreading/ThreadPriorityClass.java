package MultiThreading;

public class ThreadPriorityClass extends Thread {

    public ThreadPriorityClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i<= 5; i++) {
             String a = " ";
            for (int j = 0; j < 10000; j++) {
                a += "a";
            }

            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
    ThreadPriorityClass t1 = new ThreadPriorityClass("Low Priority Thread");
    ThreadPriorityClass t2 = new ThreadPriorityClass("Medium Priority Thread");
    ThreadPriorityClass t3 = new ThreadPriorityClass("High Priority Thread");
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.NORM_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    }
}
