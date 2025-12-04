package EDJavaMultithreadingMasterClass;

public class NewMyThread extends Thread {

    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//            System.out.println(i);
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        NewMyThread t1 = new NewMyThread();
        t1.start();
        t1.join();
        System.out.println("Hello");
    }
}
