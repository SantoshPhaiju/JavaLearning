package College;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // this is just for finding even or odd number from the array
        for (int j : arr) {
            // here the number is divisible or not by 3 is checked...
            if (j % 3 == 0) {
                continue;
            }

            if (j % 2 != 0) {
                System.out.println("Odd " + j);
            } else {
                System.out.println("Even " + j);
            }
        }
    }
}
