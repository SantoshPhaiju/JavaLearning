package ThreadsInJava;

public class ThreadWithClass extends  Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("User profile image adding to cloud in processing.... " + i);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
