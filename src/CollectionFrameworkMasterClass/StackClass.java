package CollectionFrameworkMasterClass;

import java.util.LinkedList;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // stack extends vector so it is also synchronized

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        System.out.println(stack);
        System.out.println(stack.search(9)); // outputs 7
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());
        System.out.println("Printing: ");
        stack.forEach(System.out::println);
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("stack capacity" + stack.capacity());

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

    }
}
