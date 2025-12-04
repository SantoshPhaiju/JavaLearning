package EDJavaMultithreadingMasterClass;

public class A extends B implements Runnable {

    @Override
    public void run() {
        System.out.println("A");
    }
}
