package EDJavaMultithreadingMasterClass.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {

            }
            return "ok";
        });

        completableFuture.thenAccept(result -> {
            System.out.println(result);
        });
        String s = completableFuture.get();
        System.out.println(s);
        System.out.println("Main");
    }
}
