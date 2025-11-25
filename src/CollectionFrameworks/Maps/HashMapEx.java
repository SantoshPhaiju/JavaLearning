package CollectionFrameworks.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("Santosh");
        firstList.add("Saugat");
        firstList.add("Sandwich");


        Map<String, ArrayList<String>> data = new HashMap<>();
        data.put("first", firstList);
//        data.put("second", "Saugat");
//        data.put("third", "Sandwich");

        for (Map.Entry<String, ArrayList<String>> dataVal : data.entrySet()) {
            System.out.println(dataVal.getKey() + " -> " + dataVal.getValue());
        }

        for (String myKey : data.keySet()) {
            System.out.println(data.get(myKey));
        }

        System.out.println(data.values());
//        for (String value : data.values()) {
//            System.out.println(value);
//        }

    }
}
