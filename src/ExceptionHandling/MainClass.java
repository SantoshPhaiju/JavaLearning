package ExceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};

        for (int i = 0; i < numerators.length; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Good Job :) ");
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}
