package ExceptionHandling;

public class MyStacktrace {
    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void level3() {
        int[] array = new int[5];
        array[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}
