package ThreadsInJava.Synchronization;

class MyThread extends Thread {
    private CounterVariable downloadData;

    public MyThread(CounterVariable counterVariable) {
        this.downloadData = counterVariable;
    }

    public synchronized void run() {
        for (int i = 1; i <= 50; i++) {
            // without synchronized
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            downloadData.incrementSynchronized();
            System.out.println(Thread.currentThread().getName() + ":" + downloadData.getCount() + "%");

            // with sync . uncomment to check result
//            downloadData.incrementSynchronized();
        }
    }
}
