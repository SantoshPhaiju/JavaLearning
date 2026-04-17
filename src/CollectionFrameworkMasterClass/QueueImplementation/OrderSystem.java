package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class OrderSystem {
    public static void main(String[] args) {
        BlockingQueue<String> orderQueue = new LinkedBlockingQueue<>();

        // Producer (User placing orders)
        new Thread(() -> {
            try {
                orderQueue.put("Order 1");
                orderQueue.put("Order 2");
                System.out.println("Orders placed");
            } catch (Exception e) {
            }
        }).start();

        // Consumer (Backend worker)
        new Thread(() -> {
            try {
                while (true) {
                    String order = orderQueue.take();
                    System.out.println("Processing " + order);
                    Thread.sleep(2000);
                }
            } catch (Exception e) {
            }
        }).start();

        System.out.println("System is ready to accept orders");
    }
}
