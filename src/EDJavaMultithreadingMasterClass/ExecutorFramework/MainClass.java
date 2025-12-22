package EDJavaMultithreadingMasterClass.ExecutorFramework;

public class MainClass {
    public static void main(String[] args) {

        /*
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {

            Callable<Integer> callable1 = () -> {
                System.out.println("Callable 1 is running");
                Thread.sleep(1000);
                return 1;
            };
            Callable<Integer> callable2 = () -> {
                System.out.println("Callable 2 is running");
                Thread.sleep(1000);
                return 2;
            };
            Callable<Integer> callable3 = () -> {
                System.out.println("Callable 3 is running");
                Thread.sleep(1000);
                return 3;
            };

            Future<Integer> future = executorService.submit(() -> {
                try {
                    Thread.sleep(2000);
                    System.out.println("Task is done ");
                } catch (InterruptedException e) {
                    System.out.println("Exception occurred: " + e.getMessage());
                }
                System.out.println("Hello");
                return 42;
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            future.cancel(false);
            System.out.println(future.isCancelled());
            System.out.println(future.isDone());
            executorService.shutdown();


//            List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);
//
//            try {
//                Integer i = executorService.invokeAny(list);
//                System.out.println(i);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }


//            List<Future<Integer>> futures = null;
//            try {
//                futures = executorService.invokeAll(list, 1, TimeUnit.SECONDS);
//            } catch (InterruptedException e) {
//
//            }
//            assert futures != null;
//            for (Future<Integer> future : futures) {
//                try {
//                    System.out.println(future.get());
//                } catch (CancellationException e) {
//
//                } catch (InterruptedException e) {
//
//                } catch (ExecutionException e) {
//
//                }
//            }

//            executorService.shutdown();
            // invokeAll blocks the main thread until all the tasks are completed
//            System.out.println("Hello world");


//            Future<Integer> submit = executorService.submit(() -> 1 + 2);
//            Integer i = submit.get();
//            System.out.println("sum is: " + i);
//            executorService.shutdown();
//            Thread.sleep(1);
//            System.out.println(executorService.isTerminated());
        }
*/

        // When You want to return something you use callable interface and if you don't want to return anything you use runnable interface okay...
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        Future<Integer> future = executorService.submit(() -> 42);
//        Callable<String> callable = () -> "Hello";
//        Future<?> future = executorService.submit(callable);
//        Future<?> future2 = executorService.submit(() -> System.out.println("Hello"), "Hello submitted result!");
//        System.out.println(future2.get());

//        future.cancel(true);
//        System.out.println(future.get());


//        executorService.shutdown();

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
