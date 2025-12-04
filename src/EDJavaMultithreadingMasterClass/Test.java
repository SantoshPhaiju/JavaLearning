package EDJavaMultithreadingMasterClass;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        Thread t1 = new Thread(world);
        t1.start();
//        System.out.println(Thread.currentThread().getName());

        for (; ; ) {
            System.out.println("Hello from main");
        }


    }
}
