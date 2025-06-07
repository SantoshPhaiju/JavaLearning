package ExceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Good Job :) ");
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("some exception occurred :(: " + e.getMessage());
            return -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
