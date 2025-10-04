package CollectionFrameworks.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeLearn {
    public static void main(String[] args) {
        // it is double ended queue
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offerFirst(4);
        deque.offerLast(5);
        System.out.println(deque);
        deque.offer(43);
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
