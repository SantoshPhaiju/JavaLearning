package CollectionFrameworkMasterClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i : list) {
            System.out.println(i);
        } //  👇 java internally complies this to this 👇
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // this will throw concurrent modification exception so iterable provides a way to do this
//        for (Integer number : numbers) {
//            if (number % 2 == 0) {
//                numbers.remove(number);
//            }
//        }
        //  👇 Like this...  👇
        Iterator<Integer> iterator1 = numbers.iterator();
        while (iterator1.hasNext()) {
            Integer number = iterator1.next();
            if (number % 2 == 0) {
                iterator1.remove();
            }
        }
        System.out.println(numbers);

        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());

            // we do have many methods like add, set, remove, hasPrevious, nextIndex, previousIndex, etc. in listIterator
        }

    }
}
