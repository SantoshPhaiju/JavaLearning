package CollectionFrameworks.Set;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        Set<String> mySet = new TreeSet<>();

        mySet.add("Santosh");
        mySet.add("BMW");
        mySet.add("MERCEDES");
        mySet.add("New Mercedes");
        mySet.add("Hyundai");
        mySet.add("Tesla");
        mySet.add("Parks");

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(mySet);
    }
}
