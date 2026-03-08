package CollectionFrameworkMasterClass.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // It is also not a thread safe like hashmap
        // linked hashmap is thorai slow than hashmap
        /*
            We use linkedhasmap when we need the order
         */
//        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); // uses doubly linked list
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.3f, true);


        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 12);
        hashMap.put("Banana", 20);
        hashMap.put("Guava", 13);

        System.out.println("HashMap does not maintain order: ");

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Guava", 13);
        map.get("Apple");
        map.get("Banana");
        map.get("Guava");
        map.get("Apple");

        System.out.println("LinkedHashMap maintains order: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Hero1", 33);
        map2.put("Villain1", 22);
        map2.put("Hero", 44);
        map2.put("Villain", 55);
        LinkedHashMap<String, Integer> heros = new LinkedHashMap<>(map2);

        System.out.println("HashMap");
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("LinkedHashMap");
        for (Map.Entry<String, Integer> entry : heros.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map2.put("Shubham", 91);
        map2.put("Bob", 80);
        map2.put("Akshit", 78);

        Integer shubham = map2.getOrDefault("vipul", 0);
        map2.putIfAbsent("Vipul", 33);
        System.out.println(map2);
        System.out.println(shubham);
    }
}
