package EDJavaMultithreadingMasterClass.ExecutorFramework;

import java.util.concurrent.*;

public class MainClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // When You want to return something you use callable interface and if you don't want to return anything you use runnable interface okay...
        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(() -> 42);
        Callable<String> callable = () -> "Hello";
        Future<?> future = executorService.submit(callable);

//        future.cancel(true);
        System.out.println(future.get());


        executorService.shutdown();

//        long startTime = System.currentTimeMillis();
//        Thread[] threads = new Thread[9];
//        ExecutorService executor = Executors.newFixedThreadPool(3);
//        Executors.newSingleThreadExecutor();
//        for (int i = 1; i < 10; i++) {
//            int finalI = i;
//            executor.submit(() -> {
//                long result = factorial(finalI);
//                System.out.println(result);
//            });
//        }

//        executor.shutdown();

//        try {
//           boolean isTerminated = executor.awaitTermination(100, TimeUnit.SECONDS);
//           System.out.println("Is terminated: " + isTerminated);
//            while (!executor.awaitTermination(100, TimeUnit.MILLISECONDS)) {
//                System.out.println("Waiting for all threads to finish");
//            }
//           while (!executor.isTerminated()) {
//            System.out.println("Waiting for all threads to finish");
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        System.out.println("Total time taken: " + (System.currentTimeMillis() - startTime) + " ms");
    }

//    private static long factorial(int n) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        long result = 1;
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
}
