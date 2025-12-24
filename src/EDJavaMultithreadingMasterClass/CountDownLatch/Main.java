package EDJavaMultithreadingMasterClass.CountDownLatch;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        executorService.submit(new DependentService(latch));
        latch.await();

        System.out.println("All dependent services started. Starting main service...");
        executorService.shutdown();

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Future<String> future1 = executorService.submit(new DependentService());
//        Future<String> future2 = executorService.submit(new DependentService());
//        Future<String> future3 = executorService.submit(new DependentService());

        // here we wait for all dependent services to finish, and if there are lots of dependent service it will be hectic to write all the futures.get(), so to fix this we use CountDownLatch.
//        future1.get();
//        future2.get();
//        future3.get();
//        System.out.println("All dependent services finished. Starting main service...");
//        executorService.shutdown();

    }
}


class DependentService implements Callable<String> {
    private final CountDownLatch latch;

    public DependentService(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        try {
            System.out.println(Thread.currentThread().getName() + " service started.");
            Thread.sleep(2000);
        } finally {
            latch.countDown();
        }
        return "okay";
    }
}
