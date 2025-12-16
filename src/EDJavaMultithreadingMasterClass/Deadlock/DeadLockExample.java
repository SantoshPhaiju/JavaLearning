package EDJavaMultithreadingMasterClass.Deadlock;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}


class Paper {
    public synchronized void writeWithPaperAndPen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen.");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}


class Task1 implements Runnable {
    private final Paper paper;
    private final Pen pen;

    public Task1(Pen pen, Paper paper) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        synchronized (paper) {
            pen.writeWithPenAndPaper(paper); // thread1 locks pen and tries to lock paper
        }
    }
}

class Task2 implements Runnable {
    private final Paper paper;
    private final Pen pen;

    public Task2(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        paper.writeWithPaperAndPen(pen); // thread2 locks paper and tries to lock pen
    }
}


public class DeadLockExample {
    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread t2 = new Thread(new Task2(paper, pen), "Thread-2");

        t1.start();
        t2.start();

    }
}
