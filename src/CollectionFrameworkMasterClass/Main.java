package CollectionFrameworkMasterClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList
        List<Integer> myArrayList = new ArrayList<>();

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));

        System.out.println("For loop");
        myArrayList.forEach(item -> {
            System.out.println(item);
        });

        System.out.println("contains: " + myArrayList.contains(1));
        System.out.println("contains: " + myArrayList.contains(20 ));



    }
}
