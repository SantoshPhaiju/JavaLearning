package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the queue interface
        // orders elements based on their natural ordering (for primitives lowest comes first)
        // can use custom comparator for customize ordering
        // does not allow null elements

        // priorityQueue is implemented as a min-heap by default (for natural ordering)

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);

        System.out.println(pq);

//        System.out.println(pq.remove());
//        System.out.println(pq);
//        System.out.println(pq.remove());
//        System.out.println(pq);
//        System.out.println(pq.remove());
//        System.out.println(pq);

        System.out.println(pq); // not sorted
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
