package CollectionFrameworks.Maps;

import java.util.*;

public class HashMapEx {
    public static void main(String[] args) {

        Map <String, String> data = new HashMap<>();
        data.put("first", "Santosh");
        data.put("second", "Saugat");
        data.put("third", "Sandwich");

        for (Map.Entry<String, String> dataVal : data.entrySet()) {
            System.out.println(dataVal.getKey() + " -> " + dataVal.getValue());
        }

        for (String myKey : data.keySet()) {
            System.out.println(data.get(myKey));
        }

    }
}
