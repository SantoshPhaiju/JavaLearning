package CollectionFrameworkMasterClass.Sets;

import enums.Day;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

enum Permissions {
    READ,
    WRITE,
    DELETE,
    MODIFY
}

public class EnumSetDemo {
    public static void main(String[] args) {
        Set<Day> days = EnumSet.allOf(Day.class);
        System.out.println(days.contains(Day.MONDAY));
        System.out.println(days);

        EnumSet<Permissions> permissionsOfUserA = EnumSet.of(Permissions.READ, Permissions.WRITE);
        System.out.println(permissionsOfUserA);

        if (permissionsOfUserA.contains(Permissions.DELETE)) {
            System.out.println("User A has Delete permission");
        } else {
            System.out.println("User A does not have delete permission");
        }

        HashMap<Integer, Day> map = new HashMap<>();
        map.put(1, Day.MONDAY);
        map.put(2, Day.TUESDAY);
        map.put(3, Day.WEDNESDAY);
        System.out.println(map);
        for (Integer day : map.keySet()) {
            System.out.println(day + " -> " + map.get(day));
        }
        for (Map.Entry<Integer, Day> entry : map.entrySet()) {
            System.out.println(entry);
        }

        if (map.containsValue(Day.MONDAY)) {
            System.out.println("Monday is present in the map");
        }

        Map<Day, String> openingTimes = new HashMap<>();
        openingTimes.put(map.get(1), "9:00 AM");
        openingTimes.put(map.get(2), "10:00 AM");
        openingTimes.put(map.get(3), "11:00 AM");
        System.out.println(openingTimes);

        String openingTimeOfTuesday = openingTimes.get(map.get(2)) != null ? "Will be opened on Tuesday!" : "Will be remained closed on Tuesday!";
        System.out.println(openingTimeOfTuesday);
    }
}
