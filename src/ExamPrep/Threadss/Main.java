package ExamPrep.Threadss;

class SharedResource {
    int data;
    boolean available = false;

    synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // Notify producer
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.produce(i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}

