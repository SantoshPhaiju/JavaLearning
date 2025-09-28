package JavaMultiThreading;



class Thread1 extends Thread {
    private String name;
    public Thread1(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " thread is running.");
    }
}

public class Test {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println(Thread.currentThread().getName());
//        Thread1 t1 = new Thread1("Santosh's");
//        t1.start();
//        System.out.println(t1.getName());

        World world = new World();
        Thread t2 = new Thread(world);
        t2.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
        }


    }

}
