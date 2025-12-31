package JavaGenerics;


enum DAY {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

enum Operation {
    ADD, DIVIDE, SUBTRACT, MULTIPLY;

    public <T extends Number> double apply(T a, T b) {
        switch (this) {
            case ADD:
                return a.doubleValue() + b.doubleValue();

            case DIVIDE:
                return a.doubleValue() / b.doubleValue();

            case MULTIPLY:
                return a.doubleValue() * b.doubleValue();

            case SUBTRACT:
                return a.doubleValue() - b.doubleValue();

            default:
                return 0;
        }
    }
}


public class EnumGenerics {
    public static void main(String[] args) {
        DAY day = DAY.SUNDAY;
//        DAY day1 =  "SUNDAY";
        double result1 = Operation.MULTIPLY.apply(13, 22);
        double myInt = Operation.ADD.apply(45, 33);
        System.out.println("myint: " + myInt);
        System.out.println("Result: " + result1);
    }
}
