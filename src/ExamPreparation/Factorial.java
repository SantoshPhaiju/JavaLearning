package ExamPreparation;

public class Factorial {
    static long factorial(int n) {
        if (n == 0){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }
}
