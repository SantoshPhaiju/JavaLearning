package DSA;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    System.out.println(value + " pushed into stack.");
                    break;
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("Stack Underflow! Cannot pop.");
                    } else {
                        System.out.println("Popped: " + stack.pop());
                    }
                    break;
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty! No top element.");
                    } else {
                        System.out.println("Top Element: " + stack.peek());
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is Empty!");
                    } else {
                        System.out.println("Stack elements: " + stack);
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
