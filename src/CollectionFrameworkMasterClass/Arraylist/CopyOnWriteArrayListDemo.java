package CollectionFrameworkMasterClass.Arraylist;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        /*
         "COPY ON WRITE" means that whenever a write operation, like adding or removing an element
         instead of directly modifying the existing list a new copy of the list is created, and the modification is applied to that copy
         This ensures that other threads reading the list while it's being modified are unaffected.

         Read Operations: Fast and direct, since they happened on a stable list without interference from modifications
         Write Operations: A new copy of the list is created for every modification.
         The reference to the list is then updated so that later reads use this new list.

         Will use when read-intensive task is being performed on the list.

         it is memory intensive
         */
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial shopping list: " + shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
            // trying to modify the list while reading, it doesn't reflect immediately because we are reading the shoppingList from a copy of it and updating in the shoppingList itself so the data will be updated in the shoppingList but we can see it after the read operation completes
            if (item.equals("Eggs")) {
                shoppingList.add("Butter");
                System.out.println("Added butter while reading the list");
            }
        }
        // after read operation is completed oldArrayList will be equal to = new ArrayList with modified data.

        System.out.println("Updated shopping list: " + shoppingList);


    }
}
