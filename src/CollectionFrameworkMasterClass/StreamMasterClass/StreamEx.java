package CollectionFrameworkMasterClass.StreamMasterClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        int size = 10_000;
        // a function in java
        Function<Integer, Integer> squareFunc = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer n) {
                return n * n;
            }
        };

        ArrayList<Integer> list = new ArrayList<>(List.of(1, 3, 4, 5, 3, 43, 22, 5, 3, 2, 2));
        System.out.println("Here is the real list: ");
        System.out.println(list);
        System.out.println("Here is the squared list: ");
        Stream<Integer> newList = list.stream().map(squareFunc);
        System.out.print("[");
        newList.forEach(n -> System.out.print(n.toString() + " "));
        System.out.print("]");
        System.out.println();

        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

//        int sum = nums.stream().map(i -> i * 2).reduce(0, (a, b) -> a + b);
        int sum = nums.stream().map(i -> i * 2).reduce(0, Integer::sum);
        System.out.println(sum);

    }
}
