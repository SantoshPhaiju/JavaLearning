package MultiThreading;

public class ThreadTest {
    public static void main(String[] args) {
        World world = new World();
        world.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello" + i);
        }
    }
}
