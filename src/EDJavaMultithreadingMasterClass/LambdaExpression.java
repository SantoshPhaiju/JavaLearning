package EDJavaMultithreadingMasterClass;

public class LambdaExpression {
    public static void main(String[] args) {
        //        Runnable runnable = new Runnable() {
        //            @Override
        //            public void run() {
        //
        //            }
        //        };

        // Those interface which have a single abstract method (SAM) is called functional interface
        // Runnable is a functional interface


        // Lambda expression:- It is a small anonymous function

//        Runnable task1 = () -> System.out.println("Hello World");
        // this is implementation class of Runnable.👇
        Thread t1 = new Thread(() -> System.out.println("Hello World"));
        t1.start();
    }
}
