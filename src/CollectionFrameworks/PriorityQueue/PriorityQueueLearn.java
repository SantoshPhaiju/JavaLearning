package CollectionFrameworks.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueLearn {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(5);
        pq.offer(10);
        pq.offer(1);
        pq.offer(2);
        pq.offer(6);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println("Peek: " + pq.peek());

    }
}