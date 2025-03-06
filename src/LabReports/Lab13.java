package LabReports;

// write a program to demonstrate method overloading with different parameters.
class OverloadingEx {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Lab13 {
    public static void main(String[] args) {
        OverloadingEx simpleEx = new OverloadingEx();
        System.out.println(simpleEx.sum(1, 2));
        System.out.println(simpleEx.sum(1, 2, 3));
    }
}
