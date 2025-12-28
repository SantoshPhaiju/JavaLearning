package GenericsInJava;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];

        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
//        list.get(0);
        System.out.println(list);
    }
}
