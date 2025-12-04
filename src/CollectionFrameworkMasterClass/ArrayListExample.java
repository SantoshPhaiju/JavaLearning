package CollectionFrameworkMasterClass;

import java.util.*;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return 0;
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer s1, Integer s2) {
        return s2 - s1;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);


        arrayList.set(1, 3);

//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList);

        // giving the initial capacity, it will resize after the 100 size
        ArrayList<Integer> myList = new ArrayList<>(100);


        // Arrays.asList() -> returns fixed sized LIST, cannot add or remove but can set(update) or replace the valude at certain index
        List<Integer> newlist = Arrays.asList(1, 2, 4);
//        newlist.add(3); // throws exception can't do this
//        newlist.remove(3); // throws exception can't do this
        newlist.set(1, 5); // this can be done

//        System.out.println(newlist);


        // List.of() method => returns unmodifiable list (can't replace too)
        List<Integer> newList2 = List.of(3, 4, 5, 56, 6);
//        newList2.set(1, 4); // can't do this here

//        System.out.println(newList2);

        // for creating modifiable list of it
        List<Integer> list2 = new ArrayList<>(newList2);
        list2.add(1);
        list2.add(0, 0); // adding in the specific index


//        System.out.println(list2);

        List<Integer> integers = List.of(4, 5, 6, 7, 8, 9);
        list2.addAll(integers);
//        System.out.println(list2);

        // remove by value
        List<String> newString = List.of("Santosh", "Messi", "Apple", "something");
        List<String> myStrings = new ArrayList<>(newString);
        myStrings.remove("something"); // remove by value
//        System.out.println(myStrings);
        myStrings.remove(1); // remove by index
//        System.out.println(myStrings);

        List<Integer> newIntList = new ArrayList<>();
        newIntList.add(1);
        newIntList.add(2);
        newIntList.add(3);
        newIntList.add(4);
        newIntList.add(5);

        newIntList.remove(Integer.valueOf(4)); // for removing by value because doing newIntList.remove(4) will remove from index because it takes Object type so need to pass Class type of value here in it's constructor

        newIntList.sort(new MyComparator());
        System.out.println(newIntList);
        // converting list to array
        Object[] array = newIntList.toArray();
        Integer[] array1 = newIntList.toArray(new Integer[0]);
        array1[0] = 1;
        array1[1] = 2;
//        for (int num: array1) {
//            System.out.println(num);
//        }

        Collections.sort(myStrings);
        myStrings.sort(null);
        System.out.println(myStrings);
        myStrings.sort(new StringLengthComparator());
        System.out.println(myStrings);

    }
}
