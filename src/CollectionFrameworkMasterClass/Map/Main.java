package CollectionFrameworkMasterClass.Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // it is a key value pair

//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("Santosh", 20);
//        myMap.put("Messi", 25);
//
//        System.out.println(myMap);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akshit");
        map.put(3, "Shubham");
        map.put(2, "Neha");
        System.out.println(map);
//        System.out.println(map.get(3));

        Set<Integer> keys = map.keySet();
        for (int i : keys) {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map);
//        map.remove(3);
        boolean nitin = map.remove(3, "Nitin");
        System.out.println("Is removed? " + nitin);
        System.out.println(map);
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("Neha"));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        boolean contains = list.contains(3);

        /*
            hashmap is unordered
            you can add multiple null(s) in value but you can only add one null in key
            it is not synchronized so it is not thread safe
            offers constant-time performance for basic operations like get and put assuming the hash
            function disperses elements properly among the buckets
         */

    }
}
