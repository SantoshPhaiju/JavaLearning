package MultiThreading;

public class ThreadTest {
    public static void main(String[] args) {
        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
        System.out.println(Thread.currentThread().getState());

    }
}
