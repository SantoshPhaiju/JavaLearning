package CollectionFrameworkMasterClass.Sets;

import enums.Day;

import java.util.EnumSet;
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
    }
}
