package CollectionFrameworks.ArrayList;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Ball");
        list.add("Cat");

        System.out.println(list);

        String returnData = list.get(1);
        System.out.println(returnData);
    }
}
