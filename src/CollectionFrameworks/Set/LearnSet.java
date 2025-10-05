package CollectionFrameworks.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> mySet = new HashSet<>();
//        Set<Integer> mySet = new LinkedHashSet<>();
        Set<Integer> mySet = new TreeSet<>();
        mySet.add(43);
        mySet.add(12);
        mySet.add(20);
        mySet.add(18);
        mySet.add(12); //doesn't insert duplicate data
        mySet.add(10);
        mySet.add(99);

        System.out.println(mySet);

        mySet.remove(12);
        System.out.println(mySet);
        System.out.println(mySet.contains(21));
        System.out.println(mySet.size());
        System.out.println(mySet.isEmpty());
        mySet.clear();
        System.out.println(mySet);
    }
}
