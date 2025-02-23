package DSA;

public class MyQueue {

        private int[] queue = new int[10];
        private int front = 0, rear = 0;

    public void enQueue(int data) {
        if(rear == 10) {
            System.out.println("Queue is full");
        } else {
            queue[rear] = data;
            System.out.println("Enqueue " + data);
            rear++;
        }
    }


}
