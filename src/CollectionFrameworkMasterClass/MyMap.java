package CollectionFrameworkMasterClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Santosh Phaiju");
        map.put("email", "santoshphaiju@gmail.com");

        map.values().forEach(System.out::println);

        List<Map<String, String>> listOfMaps = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "Santosh");
        map1.put("role", "Developer");

        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "Ram");
        map2.put("role", "Designer");

        listOfMaps.add(map1);
        listOfMaps.add(map2);

        for (Map<String, String> item : listOfMaps) {
            System.out.println(item);
        }

        System.out.println(listOfMaps);
    }
}
