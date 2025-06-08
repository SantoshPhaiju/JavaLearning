package WrapperClasses;

public class MathClass {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;

        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        int c = -32;
        System.out.println(Math.abs(c));
        double d = 3.54;
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        int e = 144;
        System.out.println(Math.sqrt(e));
        System.out.println(Math.pow(12, 2));
        System.out.println(Math.log(4));
        System.out.println((int) (Math.random() * 10 + 1));
    }
}
