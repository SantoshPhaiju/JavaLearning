package CollectionFrameworkMasterClass.Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // feature introduced in java 8
        // process collections of data in a functional and declarative manner
        // simplifies data processing
        // embrace functional programming
        // improve readability and maintainability
        // enable easy parallelism

        // What is stream?
        // a sequence of elements supporting various operations and supporting functional and declarative programming

        // How to use stream?
        // source, intermediate operation & terminal operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        numbers.stream();

        // creating streams
        // 1. From Collections
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill");
        Stream<String> stream = names.stream();
        // 2. From Arrays
        String[] array = {"John", "Jane", "Jack", "Jill"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. Stream of primitive types
        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);

        // 4. Infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1).limit(100);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println("collect: " + collect);

    }
}
