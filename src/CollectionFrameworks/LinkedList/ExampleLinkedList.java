package CollectionFrameworks.LinkedList;

import java.util.*;

public class ExampleLinkedList {
    public static void main(String[] args) {

        List<String> datas = new LinkedList<>();

        datas.add("BMW");
        datas.add("MERCEDES");

        datas.forEach(data -> System.out.println(data));

        List<Integer> myNumbers = new LinkedList<>();
        List<Integer> newNumber = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            myNumbers.add(i);
        }

        for (Integer myNumber : myNumbers) {
            System.out.println(myNumber);
        }

        newNumber.addAll(myNumbers);


        myNumbers.remove(5);
        myNumbers.remove(2);
        myNumbers.remove(3);
        System.out.println("with foreach");

        myNumbers.forEach(num -> {
            System.out.println("myNum " + num);
        });

        System.out.println("New numbers: ");
        newNumber.add(40);
        newNumber.forEach(num -> System.out.println("newNumbers " + num));

        System.out.println("Does new numbers contains 3: " + (newNumber.contains(3) ? "Yes": "No"));


    }
}
