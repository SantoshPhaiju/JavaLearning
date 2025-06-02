package MultiThreading;

public class A extends B implements Runnable {
    @Override
    public void run() {
        System.out.println("Running A");
    }

}
