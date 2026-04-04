package CollectionFrameworkMasterClass.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        // sorted map is an interface that extends Map and guarantees that the entries are sorted based on the keys, either in their natural ordering or by a specified Comparator.

        // * Implementation class of sortedMap is treemap
//        SortedMap<String, Integer> sortedMap = new TreeMap<>(Comparator.reverseOrder());
//        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        // treemap internally uses red black tree: self-balancing binary search tree okay sirr...

        // time complexity is log(n), because it needs to sort.
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Vivek", 91);
        sortedMap.put("Santosh", 99);
        sortedMap.put("Raj", 83);
        sortedMap.put("Saugat", 88);
        sortedMap.put("Akshit", 95);
        sortedMap.put("Alisha", 78);
        System.out.println(sortedMap);


        System.out.println(sortedMap.get("Akshit"));
        System.out.println(sortedMap.containsValue(88));

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("Santosh").values()); // excludes Santosh
        System.out.println(sortedMap.tailMap("Alisha").values()); // includes Alisha

//        System.out.println(sortedMap.subMap("Akshit", "Raj").values());


    }
}
