package JavaGenerics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Pair<String, Integer> pair = new Pair<>("age", 20);

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


//        list.add(123);
        list.add("santosh");

        Box<Integer> myIntList = new Box<>();
        myIntList.setValue(1);
        myIntList.setValue(2);
        myIntList.setValue(3);


        list.forEach(System.out::println);
    }
}
