package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        // linkedlist implementation for stack
//        LinkedList<Integer> queue1 = new LinkedList<>();
//        queue1.addFirst(3);
//        queue1.addFirst(2);
//        queue1.addFirst(1);
//        System.out.println(queue1);
//        queue1.removeFirst();
//
//        System.out.println(queue1);
//
//        // linkedlist implementation for queue
//        LinkedList<Integer> queue = new LinkedList<>();
//        queue.addLast(1); // enqueue
//        queue.addLast(2);
//        queue.addLast(3);
//        System.out.println(queue);
//        queue.removeFirst(); // dequeue
//        System.out.println(queue);
//        System.out.println(queue.getFirst()); // peek

        // queue is an interface in java, and linkedlist implements it so we can do this 👇
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove()); // throws exception if queue is empty
        System.out.println(queue1.poll()); // better than remove() because it returns null if queue is empty

//        System.out.println(queue1.element()); // throws exception if queue is empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));
        System.out.println(queue2.offer(2));

        System.out.println(queue2.offer(3));


    }
}
