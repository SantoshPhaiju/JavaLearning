package EDJavaMultithreadingMasterClass.ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleES {
    public static void main(String[] args) {
        // We are learning here Scheduled Executor Service

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        // it is a thread pool which executes tasks after a delay
//        scheduler.schedule(() -> System.out.println("Task executed after 5 second delay!"), 5, TimeUnit.SECONDS);
        scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed after every 5 seconds!"), 5, 5, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating Shutdown...");
            scheduler.shutdown();
        }, 50, TimeUnit.SECONDS);
//        scheduler.shutdown();
    }
}
