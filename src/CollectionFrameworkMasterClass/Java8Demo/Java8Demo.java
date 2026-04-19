package CollectionFrameworkMasterClass.Java8Demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Java8Demo {
    public static void main(String[] args) {
        // Streams

        // Java 8 --> minimal code, functional programming
        // Java 8 --> lambda expression, Streams, Date & Time API

        // lambda expression --> anonymous function
        // lambda expression is an anonymous function (no name, no return type, no access modifier)
        // used to implement functional interface (i.e., the interface which has a single abstract method)

        Thread t1 = new Thread(() -> System.out.println("Hello World"));
        Thread t2 = new Thread(new Task()); // instead of this we can use lambda expression live above
        t1.start();
        t2.start();

        MathOperation sum = (a, b) -> a + b;
        MathOperation sum2 = new SumOperation();
        MathOperation sub = (a, b) -> a - b;
        System.out.println(sub.operation(10, 20));
        System.out.println(sum2.operation(10, 20));
        System.out.println(sum.operation(10, 20));


        // ====== Predicate --> Functional Interface (Boolean-valued function) ========
        // it is used to filter the data based on some condition
        // it holds a condition and returns true or false
        // i'm storing condition in a variable and passing it to the Predicate.test() method
        // we need this in streams okay
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println();
        Predicate<String> isWordStartingWithLetterA = x -> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndingWithH = x -> x.toLowerCase().endsWith("h");
        Predicate<String> and = isWordStartingWithLetterA.and(isWordEndingWithH);
        System.out.println(and.test("Alish"));
        System.out.println(and.test("alisha"));


        // ==== Function --> work for you ======
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> tripleIt = x -> 3 * x;
        System.out.println(doubleIt.andThen(tripleIt).apply(20));
        System.out.println(doubleIt.compose(tripleIt).apply(20));
        System.out.println(doubleIt.apply(543));

        // used in stream okay.
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(5));


        // Consumer --> Functional Interface (void-valued function) it only takes but doesn't give anything haha lobi function
        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(532);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };

        printList.accept(list);

        // Supplier --> doesn't take anything but gives everything haha very dani thing
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());


    }

    // yo vanda ramro chai tyo maathi ko predicate wala gareko ramro thik xa. huna chai duabai gareko same ho
    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

}


class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello World 2");
    }
}

class SumOperation implements MathOperation {
    @Override
    public int operation(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}
