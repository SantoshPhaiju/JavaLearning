package College;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // this is just for finding even or odd number from the array
        for (int i = 0; i < arr.length; i++) {
            // here the number is divisible or not by 3 is checked...
            if (arr[i] % 3 == 0){
                continue;
            }

            if (arr[i] % 2 != 0){
                System.out.println("Odd " + arr[i]);
            } else {
                System.out.println("Even " + arr[i]);
            }
        }
    }
}
