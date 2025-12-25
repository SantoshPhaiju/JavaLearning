package EDJavaMultithreadingMasterClass.CountDownLatch;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierClass {
    public static void main(String[] args) {
        int numberOfSystems = 4;

        CyclicBarrier barrier = new CyclicBarrier(numberOfSystems, () -> {
            System.out.println("All subSystems are up and running. System startup complete.");
        });

        Thread webServerThread = new Thread(new SubSystem("WebServer", 2000, barrier));
        Thread databaseThread = new Thread(new SubSystem("Database", 4000, barrier));
        Thread cacheThread = new Thread(new SubSystem("Cache", 1000, barrier));
        Thread messagingServiceThread = new Thread(new SubSystem("Messaging Service", 5000, barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();


    }


}

class SubSystem implements Runnable {
    private String name;
    private int initializeTime;
    private CyclicBarrier barrier;

    public SubSystem(String name, int initializeTime, CyclicBarrier barrier) {
        this.name = name;
        this.initializeTime = initializeTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " initialization started.");
            Thread.sleep(initializeTime);
            System.out.println(name + " initialization completed.");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();

        }
    }
}
