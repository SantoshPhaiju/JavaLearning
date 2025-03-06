package LabReports;

public class Lab14 {

    static int fact(int n) {
        if ( n == 1 ) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int factorial = fact(8);
        System.out.println(factorial);
    }
}
