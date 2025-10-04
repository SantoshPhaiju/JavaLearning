package CollectionFrameworks.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLearning {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(3);
        queue.offer(12);
        queue.offer(34); // to
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.addFirst("Hello");
        myLinkedList.addLast("World");
        System.out.println(myLinkedList);
        myLinkedList.add(1, "Hello World");
        myLinkedList.removeLast();
        System.out.println(myLinkedList);
    }
}
