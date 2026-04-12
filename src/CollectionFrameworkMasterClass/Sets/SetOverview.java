package CollectionFrameworkMasterClass.Sets;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements

        // faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer> set = new TreeSet<>(); // tree set for sorted order
//        Set<Integer> set = new LinkedHashSet<>(); // linked hash set for maintaining insertion order
//        Set<Integer> set = new HashSet<>();

        // set is same like the keys in Map okay.
//        Map<Integer, String> map = new HashMap<>();
//        Set<Integer> integers = map.keySet();
        set.add(12);
        set.add(23);
        set.add(34);
        set.add(34);
        set.add(34);
        set.add(34); // no duplicate entries in set.
        set.add(45);
        set.add(53);
        set.add(645);
        set.add(82);
//        set.remove(3);
        set.add(10);
        set.add(9);
        set.add(7);
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(12));
        System.out.println(set.contains(100));


        for (int i : set) {
            System.out.println(i);
        }

        // for thread safety
        Set<Integer> integers = Collections.synchronizedSet(set);

        System.out.println(integers);

    }
}
