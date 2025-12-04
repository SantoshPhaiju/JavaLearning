package EDJavaMultithreadingMasterClass;

public class Test {
    public static void main(String[] args) {

        World world = new World();
        world.start();
//        System.out.println(Thread.currentThread().getName());

        for (; ; ) {
            System.out.println("Hello from main");
        }


    }
}
