package CommandLine;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int item: arr) {
            if(item % 2 != 0) {
                sum += item;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}
