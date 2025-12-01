package CollectionFrameworks.Maps;

import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {

//        Map<String, Integer> numbers = new HashMap<>();
          Map<String, Integer> numbers = new TreeMap<>();
        // always unique key
        numbers.put("One", 1);
        if (!numbers.containsKey("One")) {
            numbers.put("One", 2);
        }
        // can have the same value
        numbers.put("Five1", 5);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);
        numbers.putIfAbsent("One", 6);


        System.out.println(numbers);

        // How to iterate
        for (Map.Entry<String, Integer> entry : numbers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

       for(String keys: numbers.keySet()){
           System.out.println(keys + " -> " + numbers.get(keys));
       }

       for (Integer values: numbers.values()){
           System.out.println(values);
       }

        System.out.println(numbers.containsValue(4));
        System.out.println(numbers.containsValue(42));
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.size());
        numbers.remove("Five1");
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);


    }
}
