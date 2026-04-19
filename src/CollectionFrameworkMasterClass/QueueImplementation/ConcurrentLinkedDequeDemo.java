package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        // non-blocking thread-safe double-ended queue
        // uses compare and swap strategy

        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        deque.add("Santosh");
        deque.addFirst("element0");
        deque.addLast("element1");
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
    }
}
