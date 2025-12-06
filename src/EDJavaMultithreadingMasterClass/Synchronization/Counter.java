package EDJavaMultithreadingMasterClass.Synchronization;

public class Counter {
    private int count = 0;

    // this is a synchronized method
//    public synchronized void increment() {
//            count++;
//    }
    
    public void increment() {
        // and here is the synchronized block
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
