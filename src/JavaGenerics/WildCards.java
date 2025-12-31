package JavaGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1, 2, 3, 4)));

        List<? extends Number> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.add(null);

        /**
         *
         * Compare extends vs super (must-remember)
         * Feature 	? extends T	    ? super T
         * Meaning 	T or child	    T or parent
         * Read    	✅ T	        ⚠ Object
         * Add 	    ❌ (only null)	    ✅ T only
         * Use case	Reading	    Writing
         * */


        List<? super Integer> numbers2 = Arrays.asList(1, 2, 3, 4);
        List<? super Integer> numbers3 = Arrays.asList(1.1f, 2.3f, 3, 4);
//        numbers2.add("santosh"); this will give error because super class or parent class of Integer is not a string hehe...
        numbers2.add(20);
        numbers2.add(30);
        // sibling classes like Double, Float, Long are not allowed
//        numbers2.add(44.440);
        System.out.println(numbers);
        System.out.println(numbers2);
    }

    // while doing readonly kam we can use wild card type <?>
    public void printArrayList(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }


    // but while doing returning wala kam we have to use generic types
    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }

    public <T> void copy(ArrayList<T> source, ArrayList<T> destination) {
        for (T item : source) {
            destination.add(item);
        }
    }


    // upper bound (it takes subclasses of Number means subclasses like Integer, Double, Float, Long)
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // lower bound (it takes integers super classes only like Integer, Number, Object means parents of Integer class.)
    public static void printNumbers(List<? super Integer> numbers) {
        double sum = 0;
        for (Object obj : numbers) {
            System.out.println(obj);
        }

    }

}
