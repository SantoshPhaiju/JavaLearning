package CollectionFrameworkMasterClass.LinkedListPack;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer i = list.get(2); // time complexity =  O(n) because we need to traverse the whole list
        System.out.println(i);
        list.addFirst(0); // time complexity = O(1) because we don't need to shift the elements in the list.
        list.addLast(4); // time complexity = O(1)

        list.removeLast(); // time complexity = O(1)


        System.out.println(list);
    }
}
