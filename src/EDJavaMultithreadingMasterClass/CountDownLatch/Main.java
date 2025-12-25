package EDJavaMultithreadingMasterClass.CountDownLatch;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfServices = 1;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfServices);

        // CountDownLatch is not reusable, so we can use cyclicBarrier instead.
//        CountDownLatch latch = new CountDownLatch(numberOfServices);
        CyclicBarrier barrier = new CyclicBarrier(numberOfServices);
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));
        executorService.submit(new DependentService(barrier));

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
    private final CyclicBarrier barrier;

    public DependentService(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        barrier.await();
        return "okay";
    }
}
