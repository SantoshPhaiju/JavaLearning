package EDJavaMultithreadingMasterClass.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        // newCachedThreadPool() is a thread pool that creates new threads as needed, but will reuse previously constructed threads when they are available. When to use: It is used when the number of threads is not known in advance.
        ExecutorService executorService = Executors.newCachedThreadPool();
    }
}
