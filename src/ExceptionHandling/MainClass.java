package ExceptionHandling;

import College.OOP.LivingBeingExample.Animal;

public class MainClass {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};

        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }
        System.out.println("Good Job :) ");
    }

    public static int divide(int a, int b) {
        try {
            Animal dog = null;
            dog.walk();
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred :(: ");
            return -1;
        } catch (NullPointerException e) {
            System.out.println("Null Pointer exception :(");
            return -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
