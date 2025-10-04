package CollectionFrameworks.StackClass;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Mystack: " + stack);
        System.out.println("pop: " + stack.pop());
        System.out.println("pop: " + stack.pop());
        System.out.println("peek: " + stack.peek());
        System.out.println("Search: " + stack.search(2));
        System.out.println(stack);
        System.out.println("Printing: ");
        stack.forEach(System.out::println);
        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("stack capacity" + stack.capacity());
    }
}
