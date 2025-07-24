package VolatilePackage;


class SharedResource {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
        System.out.println("Writer thread made the flag true");
    }

    public void printIfFlagTrue() {
        while (!flag) {
            // do nothing
        }

            System.out.println("Flag is True!");

    }
}

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedResource.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> {
            sharedResource.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();



    }
}
