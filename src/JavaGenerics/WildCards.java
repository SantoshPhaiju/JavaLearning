package JavaGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(1, 2, 3, 4)));
    }

    // while doing readonly kam we can use wild card type <?>
    public void printArrayList(ArrayList<?> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }


    // but while doing returning wala kam we have to use generic types
    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }

    public <T> void copy(ArrayList<T> source,  ArrayList<T> destination) {
        for (T item: source) {
            destination.add(item);
        }
    }


    // upper bound (it takes subclasses of Number)
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number: numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    // lower bound (it takes integers super classes only )
    public static void printNumbers(List<? super Integer> numbers) {
        double sum = 0;
        for (Object obj: numbers) {
            System.out.println(obj);
        }

    }

}
