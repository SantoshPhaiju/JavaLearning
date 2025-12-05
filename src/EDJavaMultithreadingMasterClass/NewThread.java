package EDJavaMultithreadingMasterClass;

public class NewThread extends Thread {

//    public NewThread(String name) {
//        super(name);
//    }

    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority() + "- count: " + i);
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted" + e.getMessage());
//            }
//        }

//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + " is running...");
//            Thread.yield(); // this means giving chance to the other threads also to run just a hint to the jvm.
//        }

        while (true) {
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {

        NewThread t1 = new NewThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done");


//        NewThread t1 = new NewThread();
//        NewThread t2 = new NewThread();
//        t1.start();
//        t2.start();

//        NewThread t1 = new NewThread("Thread-1");
//        NewThread t2 = new NewThread("Thread-2");
//        NewThread t3 = new NewThread("Thread-3");
//        t1.setPriority(Thread.MIN_PRIORITY);
//        t2.setPriority(Thread.NORM_PRIORITY);
//        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//        t1.interrupt();

    }
}


// Daemon Threads:- Are those threads which runs in background and are not managed by the main thread. JVM doesn't wait for them to finish.
