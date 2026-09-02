package CollectionFrameworkMasterClass.StreamMasterClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for (int i = 0; i < size; i++) {
            nums.add(ran.nextInt(100));
        }

//        int sum = nums.stream().map(i -> i * 2).reduce(0, (a, b) -> a + b);
        int sum = nums.stream().map(i -> i * 2).reduce(0, Integer::sum);
        System.out.println(sum);

        long startSeq = System.currentTimeMillis();
        int sum2 = nums.stream()
                .map(i -> {

                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum3 = nums.parallelStream()
                .map(i -> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    return i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        long endPara = System.currentTimeMillis();


        System.out.println(sum + " " + sum2 + " " + sum3);
        System.out.println("Sequential time: " + (endSeq - startSeq));
        System.out.println("Parallel time: " + (endPara - startPara));


        // ----------------- this is different thing -----------------------
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

    }
}
