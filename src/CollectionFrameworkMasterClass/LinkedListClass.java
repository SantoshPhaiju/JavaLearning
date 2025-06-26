package CollectionFrameworkMasterClass;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);


        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
    }
}
