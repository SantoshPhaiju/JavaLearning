package EDJavaMultithreadingMasterClass;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        Thread t1 = new Thread(world);
        t1.start(); // it is runnable state
//        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello from main");

    }
}
