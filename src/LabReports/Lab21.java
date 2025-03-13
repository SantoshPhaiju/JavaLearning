package LabReports;

public class Lab21 {
    public static int divide(int a, int b) throws CustomException {
        if(b < 0) {
            throw new CustomException("Denominator cannot be negative number");
        }
        return a / b;
    }


    public static void main(String[] args) {
        int num1 = 40;
        int num2 = -3;

        try {
            int result = divide(num1, num2);
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Number is not divisible by zero");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
