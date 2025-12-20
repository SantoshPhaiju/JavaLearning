package EDJavaMultithreadingMasterClass.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        Thread[] threads = new Thread[9];
        ExecutorService executor = Executors.newFixedThreadPool(3);
//        Executors.newSingleThreadExecutor();
        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });
        }

        executor.shutdown();


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
        System.out.println("Total time taken: " + (System.currentTimeMillis() - startTime) + " ms");
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
