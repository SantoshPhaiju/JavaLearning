package EDJavaMultithreadingMasterClass;

//public class World extends Thread {
//    @Override
//    public void run() {
//        for (; ; ) {
//            System.out.println("World from thread");
//        }
//    }
//}

public class World implements Runnable {
    @Override
    public void run() {
        System.out.println("World from thread");
    }
}
