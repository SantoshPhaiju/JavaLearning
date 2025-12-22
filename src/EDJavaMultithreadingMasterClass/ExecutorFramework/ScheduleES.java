package EDJavaMultithreadingMasterClass.ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduleES {
    public static void main(String[] args) {
        // We are learning here Scheduled Executor Service

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


        // schedule & scheduleAtFixedRate methods...
        // it is a thread pool which executes tasks after a delay
//        scheduler.schedule(() -> System.out.println("Task executed after 5 second delay!"), 5, TimeUnit.SECONDS);

        // this will execute the task every 5 seconds
        ScheduledFuture<?> scheduledFuture = scheduler.scheduleAtFixedRate(() -> System.out.println("Task executed after every 5 seconds!"), 5, 5, TimeUnit.SECONDS);

        // this will execute the next task after the complete execution of the previous task with the dealy...
        ScheduledFuture<?> scheduledFuture1 = scheduler.scheduleWithFixedDelay(() -> System.out.println("Task executed after every 5 seconds!"), 5, 2, TimeUnit.SECONDS);

        scheduler.schedule(() -> {
            System.out.println("Initiating Shutdown...");
            scheduler.shutdown();
        }, 20, TimeUnit.SECONDS);
        System.out.println("Scheduler shut down!");
//        scheduler.shutdown();
    }
}
