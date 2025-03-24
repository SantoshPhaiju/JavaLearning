package ThreadsInJava;

class MyThread extends Thread {
    @Override
    public void start() {
        System.out.println("Starting Thread...");
    }
}

public class MainClass {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();


        UsingInterfaceThread t2 = new UsingInterfaceThread();
        ThreadWithClass t3 = new ThreadWithClass();

        t3.start();
        t2.run();

        System.out.println("User registration successful");
    }
}
