package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.Comparator;
import java.util.concurrent.*;

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

        // All the blocking queues are used when we need thread communication right, so that each of them blocks each other simply, if we don't need thread communication and non-blocking type of thing then we should use threadsafenonblockingqueues they are like:- concurrentLinkedQueue, concurrentLinkedDeque

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // fixed size given
        // A bounded, blocking queue backed by circular array
        // low-memory overhead
        // single lock, producer and consumer block each other
        // uses a single lock for both enqueue and dequeue operations, more waiting
        // if there are many threads --> we will have problem
        // used when there are less threads

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));

//        producer.start();
//        consumer.start();

        BlockingQueue<Integer> queue2 = new LinkedBlockingQueue<>();
        // optionally, bounded can occur out of memory error, so keep it bounded
        // backend by linkedlist
        // uses two separate locks for enqueue and dequeue operations
        // higher concurrency between producer and consumer, less waiting
        // used when there are many threads

        BlockingQueue<String> queue3 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder()); // default capacity 11
        // also unbounded
        // same as priorityQueue, backend by binary heap as array and can grow dynamically
        // head is based on their natural ordering or by a provided comparator like priority queue
        // put won't block

        queue3.add("apple");
        queue3.add("banana");
        queue3.add("cherry");
        System.out.println(queue3);

        BlockingQueue<Integer> queue4 = new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa
        // first item inserted and next will not be inserted until the first one is not removed.
        // it cannot store elements, capacity of at most one element


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
