package arrays;

public class ArrayLearning {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 5, 3, 2, 2, 1};

        for (int number : numbers) {
            number = number * 2;
            System.out.println(number);
        }

        String[] names = new String[10];
        String surname = new String("Phaiju");
        System.out.println(surname);
        names[0] = "Santosh Phaiju";

        System.out.println(names[0]);

    }
}
