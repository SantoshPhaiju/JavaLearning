package GenericsInJava;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

//        Generics allow you to write type-safe, reusable code by parameterizing types.
        /**
         * Common Generic Type Naming Convention
         * Letter	Meaning
         * T ->	Type
         * E ->	Element (Collections)
         * K ->	Key (Map)
         * V ->	Value (Map)
         * N ->	Number
         *
         */

//        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
//        list.add(123);
//        list.get(0);
        System.out.println(list);
//        print("santosh");
        print(123456);
//        String str = (String) list.get(0);
    }

    // generic method -> UPPER BOUND
    private static <T extends Number> void print(T data) {
        System.out.println(data);
    }
}

// generic class -> This says that Calculator class can only accept Number type -> Int, Double, Float, Long

// Multiple Bounds -> Here first bound should be class always and second bound should be interface and only one class is allowed and implements multiple interfaces
class Calculator<T extends Number & Comparable<T> & Cloneable> {
    private T data;

    public Calculator(T data) {
        this.data = data;
    }

    double square() {
        return data.doubleValue() * data.doubleValue();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
