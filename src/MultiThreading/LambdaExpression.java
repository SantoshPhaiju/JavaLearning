package MultiThreading;

public class LambdaExpression {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        Thread t1 = new Thread(runnable);
        t1.start();


    }
}
