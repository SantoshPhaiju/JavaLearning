package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Producer produced: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}


public class BlockingQueueDemo {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // fixed size given
        // A bounded, blocking queue backed by an array

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();


        // thread-safe queue
        // which waits for queue to become non-empty / wait for space
        // useful in multithreading environment
        // simplify concurrency problems like producer-consumer problem
// standard queue -> immediately:-
        // empty --> remove (doesn't wait)
        // full --> add (not waiting)
// some blocking queue methods:-
        // put --> blocks if the queue is full until space becomes available
        // take --> blocks if the queue is empty until and element becomes available
        // offer --> waits for space to become available, up to the specified timeout


    }
}
