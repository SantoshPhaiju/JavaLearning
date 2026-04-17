package CollectionFrameworkMasterClass.QueueImplementation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        // double-ended-queue
        // allows insertion and deletion of elements form both ends
        // versatile than regular queues and stacks because they support all the operations of both.

        /*
            INSERTION METHODS

            addFirst(E e): Inserts the specified element at the front.
            addLast(E e): Inserts the specified element at the end.
            offerFirst(E e): Inserts the specified element at the front if possible.
            offerLast(E e): Inserts the specified element at the end if possible.

         */


         /*

           REMOVAL METHODS

            removeFirst(): Retrieves and removes the first element.
            removeLast(): Retrieves and removes the last element.
            pollFirst(): Retrieves and removes the first element, or returns null if empty.
            pollLast(): Retrieves and removes the last element, or returns null if empty.

           */

        /*

           EXAMINATION METHODS

            getFirst(): Retrieves, but does not remove, the first element.
            getLast(): Retrieves, but does not remove, the last element.
            peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
            peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.

           */

        /*

           STACK METHODS

            push(E e): Adds an element at the front (equivalent to addFirst(E e)).
            pop(): Removes and returns the first element (equivalent to removeFirst())..

           */

        Deque<Integer> deque1 = new ArrayDeque<>();
        // faster than linkedList during iteration, low memory consumption because we don't have to store next node pointer, and no null allowed
        // use linkedlist when need to perform operations like insertion and deletion from middle.
        // in deque we don't have to shift elements when removing elements from deque because we do have two pointers: head and tail, which is only changed during insertion and removal of elements, and it is circular
        // no need to shift elements, just shift head and tail

        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println(deque1);

        System.out.println("First element: " + deque1.getFirst());
        System.out.println("Last element: " + deque1.getLast());
        deque1.removeFirst();
        deque1.pollLast();
        System.out.println(deque1);


        Deque<Integer> deque2 = new LinkedList<>(); // insertion and deletion somewhere in middle


    }
}
