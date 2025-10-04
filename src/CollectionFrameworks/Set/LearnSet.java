package CollectionFrameworks.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(43);
        mySet.add(12);
        mySet.add(20);
        mySet.add(18);
        mySet.add(12); //doesn't insert duplicate data
        mySet.add(10);
        mySet.add(99);

        System.out.println(mySet);
    }
}
