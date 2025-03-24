package ThreadsInJava;

public class UsingInterfaceThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("User registration in processing.... " + i);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
