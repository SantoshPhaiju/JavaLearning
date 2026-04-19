package CollectionFrameworkMasterClass.Java8Demo;

public class Java8Demo {
    public static void main(String[] args) {
        // Streams

        // Java 8 --> minimal code, functional programming
        // Java 8 --> lambda expression, Streams, Date & Time API

        // lambda expression --> anonymous function
        // lambda expression is an anonymous function (no name, no return type, no access modifier)
        // used to implement functional interface (i.e., the interface which has a single abstract method)

        Thread t1 = new Thread(() -> System.out.println("Hello World"));
        Thread t2 = new Thread(new Task()); // instead of this we can use lambda expression live above
        t1.start();
        t2.start();

        MathOperation sum = (a, b) -> a + b;
        MathOperation sum2 = new SumOperation();
        MathOperation sub = (a, b) -> a - b;
        System.out.println(sub.operation(10, 20));
        System.out.println(sum2.operation(10, 20));
        System.out.println(sum.operation(10, 20));


        // ======================== Predicate ==========================
        

    }
}


class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World 2");
    }
}

class SumOperation implements MathOperation {
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}

interface MathOperation {
    int operation(int a, int b);
}
